package webex;

import java.util.Scanner;

public class workshop_bj_1463_bottomup {
//bottom-up 방식
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int dp[] = new int[number+1];
		dp[0]=0;
		dp[1]=0;
		
		for (int i = 2; i <= number; i++) {
			dp[i] = dp[i-1]+1; //1을 빼는 경우의 수 더하기 //만약 2와 3으로 나누어지지않는다면 변하지않음
			if (i%2==0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1); //2로나눈경우 2로나눈것의 경우의수 +1
			}
			if (i%3==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
			
		}
		System.out.println(dp[number]);
		sc.close();
	}

}
