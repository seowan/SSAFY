package webex;

import java.util.Scanner;

public class workshop_bj_1463_topdown {
//top-down방식
	
	public static int d[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		d = new int[number+1];
		
		System.out.println(dp(number));
		sc.close();
	}
	
	public static int dp(int number) {
		if (number==1) {
			return 0;
		}
		if (d[number]>0) {
			return d[number];
		}
		d[number] = dp(number-1)+1;
		if (number%3==0) {
			d[number] = Math.min(d[number], dp(number/3)+1);
		}
		if (number%2==0) {
			d[number] = Math.min(d[number], dp(number/2)+1);
		}
		return d[number];
	}

}
