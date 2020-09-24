package homework;

import java.util.Scanner;

public class bj_17069_파이프옮기기2 {
	static int [][] map;
	static int N;
	static long [][][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N+1][N+1];
		dp = new long[3][N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		dp[1][1][2] = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j+1<=N && i+1<=N && map[i+1][j]==0 && map[i+1][j+1]==0 && map[i][j+1]==0) {
					dp[1][i][j+1] += dp[0][i][j];
					dp[1][i][j+1] += dp[1][i][j];
				}
				if (j+1<=N && map[i][j+1]==0) {
					dp[1][i][j+1] += dp[0][i][j];
					dp[1][i][j+1] += dp[1][i][j];
				}
				if (i+1<=N && map[i+1][j]==0) {
					dp[2][i+1][j] += dp[0][i][j];
					dp[2][i+1][j] += dp[2][i][j];
				}
			}
		}
		System.out.println(dp[0][N][N]+dp[1][N][N]+dp[2][N][N]);
		sc.close();
	}

}
