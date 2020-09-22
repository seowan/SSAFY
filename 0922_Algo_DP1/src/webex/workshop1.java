package webex;

import java.util.Scanner;

public class workshop1 {
	//아파트 색칠하기
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long[] D = new long[N+1];
			D[1]=2;
			D[2]=3;
			for (int i = 3; i <= N; i++) {
				D[i] = D[i-1]+D[i-2];
			}
			System.out.println(D[N]);
			sc.close();
		}

	}