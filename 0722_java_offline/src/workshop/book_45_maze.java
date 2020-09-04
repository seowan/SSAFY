package workshop;
import java.util.Scanner;

// 미로탈출
public class book_45_maze {
	static int N, SR, SC, P, D;
	static int[] dr = {-1,0,1,0};
	static int[] dc = {0,1,0,-1};
	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			SR = sc.nextInt(); //출발점의 r좌표
			SC = sc.nextInt(); //출발점의 c좌표
			P = sc.nextInt();

			boolean[][] map=new boolean[N+1][N+1];

			for(int k=0; k<P; k++) {  // 점퍼를 입력
				map[sc.nextInt()][sc.nextInt()]=true;
			}
			
			D = sc.nextInt();
			int dir[] = new int[D];  // 방향 모음
			int moveCnt[] = new int[D];  // 이동 칸수 모음
			for(int k=0; k<D; k++) {  //방향, 이동칸수 입력
				dir[k] = sc.nextInt()-1;
				moveCnt[k] = sc.nextInt();
			}

			int nr=0,nc=0,r=SR,c=SC;
			for(int k=0; k<D; k++) { // 이동 지시 수 만큼 반복
				int d=dir[k];  //방향
				int dirCnt=moveCnt[k];  //이동칸수
				for(int cnt=0; cnt<dirCnt; cnt++){
					nr = r+dr[d];
					nc = c+dc[d];
					
					if(nr<1 || nr>N || nc<1 || nc>N 
							|| map[nr][nc]){  // 경계밖이거나 점퍼인가??
						r=c=0;
						break;
					}else{								// 그렇지 않으면 이동
						r = nr;
						c = nc;
					}
				}		
			}

			System.out.println("#"+tc+" "+r+" "+c);
		}
	}
}