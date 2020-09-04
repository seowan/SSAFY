package workshop;

import java.util.Scanner;

public class MovieTest {

	
//	public static void main(String[] args) {
//		MovieMgr mgr = MovieMgr.getInstance();
//		
//		mgr.add(new Movie("스타워즈", "스티븐스필버그", 15, "SF", "제다이"));
//		mgr.add(new Movie("스타워즈", "스티븐스필버그", 15, "SF", "제다이2"));
//		mgr.add(new Movie("반지의제왕", "감독", 15, "판타지", "호빗과 그의 친구들"));
//		mgr.add(new Movie("반지의제왕2", "감독", 15, "판타지", "호빗과 그의 친구들"));
//		
//		Movie[] result = mgr.search("스타");
//		print(result);
//		System.out.println(mgr.getSize());
//		
//		mgr.delete2("스타워즈");
//		System.out.println(mgr.getSize());
//		Movie[] result2 = mgr.search();
//		print(result2);
//	}
	public static void main(String[] args) {
		MovieMgr mgr = MovieMgr.getInstance();
		
		String title,director,genre,summary;
		int grade;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 영화정보 입력\n"
					+ "2. 영화정보 전체 검색\n"
					+ "3. 영화명 검색\n"
					+ "4. 감독으로 검색\n"
					+ "5. 영화 장르별 검색\n"
					+ "6. 영화정보 삭제\n"
					+ "0. 종료");
			System.out.print("메뉴 입력 : ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("타이틀 : ");
				title = sc.nextLine();
				System.out.print("감독 : ");
				director = sc.nextLine();
				System.out.print("등급 : ");
				grade = Integer.parseInt(sc.nextLine());
				System.out.print("장르 : ");
				genre = sc.nextLine();
				System.out.print("요약 : ");
				summary = sc.nextLine();
				mgr.add(new Movie(title, director, grade, genre, summary));
				break;
			case 2:
				print(mgr.search());
			case 3:	
				System.out.print("타이틀로 검색:");
				title = sc.nextLine();
				print(mgr.search(title));
			case 4:	
				System.out.print("감독으로 검색:");
				director = sc.nextLine();
				print(mgr.searchDirector(director));
			case 5:	
				System.out.print("장르로 검색:");
				genre = sc.nextLine();
				print(mgr.searchGenre(genre));
			case 6:
				System.out.println("타이틀로 삭제:");
				title = sc.nextLine();
				mgr.delete2(title);
				print(mgr.search());
			case 0:
				System.out.println("---프로그램 종료---");
				return;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다.");
				break;
			}
		}
	}
	
	private static void print(Movie[] movies) {
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
}