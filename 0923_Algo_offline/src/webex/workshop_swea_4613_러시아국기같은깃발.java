package webex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class workshop_swea_4613_러시아국기같은깃발 {
	static int N,M,min,cnt,answer;
	static char map[][] ,rowArray[];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());			
			map = new char[N][M];
			rowArray = new char[N-2];
			answer=0;
			
			for (int i = 0; i < N; i++) {
				String temp = br.readLine();
				for (int j = 0; j < M; j++) {
					map[i][j] = temp.charAt(j);
				}
			}//맵 입력끝
			
			//첫줄흰색 //마지막줄 빨간색
			for (int i = 0; i < M; i++) {
				if (map[0][i]!='W') answer++;
				if (map[N-1][i]!='R') answer++;
			}
			
			min = Integer.MAX_VALUE;
			//가운데 색입히기
			//조합으로 구현
			comb(0,0,0);
			System.out.println("#"+test_case+" "+(answer+min));
		}
	}

	static void comb(int depth, int blue, int red) {
		if (depth==N-2) {
			if (blue==0) {
				return;
			}
			cnt=0;
			
			for (int i = 0; i < rowArray.length; i++) {
				for (int j = 0; j < M; j++) {
					if (!(map[i+1][j] ==rowArray[i])) {
						cnt++;
					}
				}
			}
			min = Math.min(min, cnt);
			return;
		}
		//아직 파랑도 아니고 빨강도 아니면 화이트로
		if (blue==0 && red==0) {
			rowArray[depth] = 'W';
			comb(depth+1, blue, red);
		}
		//아직 레드가 아니면은
		if (red==0) {
			rowArray[depth]='B';
			comb(depth+1, blue+1, red);
		}
		rowArray[depth]='R';
		comb(depth+1, blue, red+1);
	}

}
