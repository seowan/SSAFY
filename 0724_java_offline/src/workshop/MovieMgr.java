package workshop;

import java.util.Arrays;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index=0;
	
	private static MovieMgr instance = new MovieMgr(); // MovieMgr.instance : 불가
	private MovieMgr() {	
	}
	public static MovieMgr getInstance() {
		return instance;
	}


	/** 파라메터로 전달된 영화 정보를 전달받아 배열에 저장한다.*/
	public void add(Movie m) {
		movies[index++] = m;
	}

	/** 배열에 저장된 모든 영화정보를 리턴한다.*/
	public Movie[]  search() {
		Movie m[] = new Movie[index];
		for (int i = 0; i < index; i++) {
			m[i] = movies[i];
		}
		return m;
	}

	/** 파라메터로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴한다*/
	public Movie[]  search(String title) {
		Movie m[] = new Movie[index];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getTitle().contains(title)) {
				m[cnt++] = movies[i];
			}
		}
		
//		Movie[] m2 = new Movie[cnt];
//		for (int i = 0; i < cnt; i++) {
//			m2[i] = m[i];
//		}
//		return m2;
		
		return Arrays.copyOfRange(m, 0, cnt);
	}

	/** 파라메터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴한다*/
	public Movie[]  searchDirector(String name) {
		Movie m[] = new Movie[index];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getDirector().equals(name)) {
				m[cnt++] = movies[i];
			}
		}
		return Arrays.copyOfRange(m, 0, cnt);
	}

	/** 파라메터로 전달된 장르의 모든 영화 정보를 검색하여 리턴한다*/
	public Movie[]  searchGenre(String genre) {
		Movie m[] = new Movie[index];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getGenre().equals(genre)) {
				m[cnt++] = movies[i];
			}
		}
		return Arrays.copyOfRange(m, 0, cnt);
	}

	/** 파라메터로 전달된 제목의 영화를 삭제한다.*/
	public void delete(String title) {// 타이틀이 유일할때
		for (int i = 0; i < index; i++) {
			if(movies[i].getTitle().equals(title)) {
				for(int j=i; j<index-1; ++j) {
					movies[j] = movies[j+1];
				}
				movies[index-1] = null;
				index--;
				break;
			}
		}
	}
	public void delete2(String title) {// 타이틀이 중복되어도 안되도
		Movie m[] = new Movie[movies.length];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(!movies[i].getTitle().equals(title)) {
				m[cnt++] = movies[i];
			}
		}
		//System.arraycopy(m, 0, movies, 0, movies.length);
		movies = m;
		index = cnt;
	}

	
	/** 저장된 영화 정보의 갯수를 리턴한다.*/
	public int  getSize() {
		return index;
	}
}