// 배열 문제 #01

package com.ssafy;

public class Test {
	public static void main(String[] args) {
		
		int N = 6;
		
		int result1 = (int)(Math.random()*N) + 1;
		int result2 = (int)(Math.random()*N) + 1;
		int result3 = (int)(Math.random()*N) + 1;
		int result4 = (int)(Math.random()*N) + 1;
		int result5 = (int)(Math.random()*N) + 1;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

	}
}

//// 배열 문제 #02
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		// 1
//		int [] intArray = new int[3];
//	    intArray[2] = 10;
//
//	    // 2
//		char charArray[] = { 'S','S','A','F','Y' };
//	
//		// 3
//		String [] strArray = { "S","S","A","F","Y" };
//	
//		// 4
//		byte[] byteArray;
//	    byteArray = { 1,2,3,4,5 };
//
//
//	}
//}
//
//// 배열 문제 #03-1
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int [] resultArray = new int[5];
//		resultArray[0] = (int)(Math.random()*N) + 1;
//		resultArray[1] = (int)(Math.random()*N) + 1;
//		resultArray[2] = (int)(Math.random()*N) + 1;
//		resultArray[3] = (int)(Math.random()*N) + 1;
//		resultArray[4] = (int)(Math.random()*N) + 1;
//		
//		System.out.println(resultArray[0]);
//		System.out.println(resultArray[1]);
//		System.out.println(resultArray[2]);
//		System.out.println(resultArray[3]);
//		System.out.println(resultArray[4]);
//
//	}
//}
//
//// 배열 문제 #03-2
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int [] resultArray = new int[5];
//
//		for( int i=0; i<5; i++ ) {
//			resultArray[i] = (int)(Math.random()*N) + 1;
//		}
//		
//		for( int i=0; i<5; i++ ) {
//			System.out.println(resultArray[i]);
//		}
//	}
//}
//
//
//// 배열 문제 #03-3
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int [] resultArray = new int[5];
//
//		for( int i=0; i<resultArray.length; i++ ) {
//			resultArray[i] = (int)(Math.random()*N) + 1;
//		}
//		
//		for( int x : resultArray ) {
//			System.out.println(x);
//		}
//	}
//}
//
//// 배열 문제 #03-4
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int [] resultArray = new int[5];
//
//		for( int x : resultArray ) {
//			x = (int)(Math.random()*N) + 1;
//		}
//		
//		for( int x : resultArray ) {
//			System.out.println(x);
//		}
//	}
//}
//
//
//// 배열 문제 #04
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		String [] students = { "홍길동", "박사피", "윤멀티", "나사기" }; 
//
//		for( String student : students ) {
//			System.out.println(student);
//		}
//	}
//}
//
//// 배열 문제 #05
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		String [] students = { "홍길동", "박사피", "윤멀티", "나사기" }; 
//
//		for( String student : students ) {
//			System.out.println(student);
//		}
//		
//		String temp = students[1];
//		students[1] = students[2];
//		students[2] = temp;
//		
//		for( String student : students ) {
//			System.out.println(student);
//		}
//	}
//}
//
//// 배열 문제 #06
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		String [] students = { "홍길동", "박사피", "윤멀티", "나사기" }; 
//
//		for( String student : students ) {
//			System.out.println(student);
//		}
//		
//		// #1
//		//students = { "홍길동", "박사피", "나사기", "윤멀티", "신자바" };
//		
//		// #2
//		String [] students2 = { "홍길동", "박사피", "나사기", "윤멀티", "신자바" };
//		
//		for( String student : students2 ) {
//			System.out.println(student);
//		}
//		
//		// #3
//		String [] students3 = new String[5];
//		System.arraycopy(students, 0, students3, 0, 4);
//		students3[4] = "신자바";
//		
//		for( String student : students3 ) {
//			System.out.println(student);
//		}
//	}
//}
//
//// 배열 문제 #07 
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		char[][] grid = new char[4][3];
//		
//		grid[0][0] = 'C'; grid[0][1] = 'A'; grid[0][2] = 'A';
//		grid[1][0] = 'C'; grid[1][1] = 'C'; grid[1][2] = 'B';
//		// 이곳에 코드를 완성하세요.
//		grid[3][0] = 'C'; grid[3][1] = 'C'; grid[3][2] = 'C';
//		
//		for( int i=0; i<grid.length; i++ ) {
//			for( int j=0; j<grid[i].length; j++ ) {
//				System.out.print(grid[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}
//
//// 배열 문제 #09
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		int[][] grid = {
//				{2, 3, 1, 4, 7},
//				{8,13, 3,33, 1},
//				{7, 4, 5,80,12},
//				{17,9,11, 5, 4},
//				{4, 5,91,27, 7}
//		};
//		
//		int count = 0;
//		int sum = 0;
//		
//		// 이곳에 코드를 완성하세요.
//		
//		System.out.println(count);
//		System.out.println(sum);
//	}
//}
//
//
//// 배열 문제 #10
//
//	2 3 1 4
//	1 X 3 2
//	3 4 X X
//	X 4 1 5
//
//package com.ssafy;
//
//import java.util.Scanner;
//
//public class Test {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		char[][] grid = new char[4][4];
//
//		// 이곳에 코드를 완성하세요.
//
//		for( int i=0; i<4; i++ ) {
//			for( int j=0; j<4; j++ ) {
//				System.out.print(grid[i][j]);
//			}
//			System.out.println();
//		}
//		sc.close();
//	}
//}
//
//
//
//
//// 배열 문제 #11
//
//	2 3 1 4
//	1 X 3 2
//	3 4 X X
//	X 4 1 5
//
//package com.ssafy;
//
//import java.util.Scanner;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		char[][] grid = new char[4][4];
//		
//		int sum = 0;
//		
//		for( int i=0; i<4; i++ )
//			for( int j=0; j<4; j++ )
//				grid[i][j] = sc.next().charAt(0);
//
//		// 이곳에 코드를 완성하세요.
//		
//		System.out.println(sum);
//		sc.close();
//	}
//}
//
//// 배열 문제 #13
//// 교재 로봇
//
//package com.ssafy;
//
//import java.util.Scanner;
//
//public class Test {
//	
//	static int T, N;
//	static int Answer;
//	
//	public static void main(String[] args) throws Exception{
//
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		
//		for(int test_case = 1; test_case <= T; test_case++)
//		{
//			N = sc.nextInt();
//			char[][] map = new char[N][N];
//			for(int i=0; i<N; i++) {
//				for(int j=0; j<N; j++) {
//					map[i][j] = sc.next().charAt(0);
//				}
//			}
//
//			Answer=0;
//			
//			for(int i=0; i<N; i++) {
//				for(int j=0; j<N; j++) {
//					
//					char robot = map[i][j];
//					
//					if(robot=='A'){
//						//우
//						for(int k=j+1; k<N; k++){
//							if(map[i][k]=='A'||map[i][k]=='B'||map[i][k]=='C'||map[i][k]=='W'){
//								break;
//							}else if(map[i][k]=='S'){
//								Answer++;
//							}
//						}
//					}else if(robot=='B'){
//						//우
//						for(int k=j+1; k<N; k++){
//							if(map[i][k]=='A'||map[i][k]=='B'||map[i][k]=='C'||map[i][k]=='W'){
//								break;
//							}else if(map[i][k]=='S'){
//								Answer++;
//							}
//						}
//						//좌
//						// 이곳에 코드를 완성하세요. 
//					}else if(robot=='C'){
//						//우
//						for(int k=j+1; k<N; k++){
//							if(map[i][k]=='A'||map[i][k]=='B'||map[i][k]=='C'||map[i][k]=='W'){
//								break;
//							}else if(map[i][k]=='S'){
//								Answer++;
//							}
//						}
//						//좌
//						for(int k=j-1; k>=0; k--){
//							if(map[i][k]=='A'||map[i][k]=='B'||map[i][k]=='C'||map[i][k]=='W'){
//								break;
//							}else if(map[i][k]=='S'){
//								Answer++;
//							}
//						}
//						//하
//						for(int k=i+1; k<N; k++){
//							if(map[k][j]=='A'||map[k][j]=='B'||map[k][j]=='C'||map[k][j]=='W'){
//								break;
//							}else if(map[k][j]=='S'){
//								Answer++;
//							}
//						}
//						//상
//						// 이곳에 코드를 완성하세요.
//					}
//				}
//			}
//			
//			System.out.println("#"+test_case+" "+Answer);
//		}
//	}
//}
//
//// 사용자 입력
//3
//6
//S A S S W S
//S W A S C S
//S W S W S S
//S W S S W S
//S B S S W S
//S S S S S S
//3
//S S A
//B W W
//S W C
//10
//C S S S S S S S S C
//S W S S S S S S W S
//S S W S S S S W S S
//A S S W S S W S S A
//S S S S S B S S S S
//S S S S B S S S S S
//A S S W S S W S S A
//S S W S S S S W S S
//S W S S S S S S W S
//C S S S S S S S S C
//
//// 결과
//#1 9
//#2 0
//#3 62
//
//// 배열 문제 #14
//// 교재 소금쟁이
//
//package com.ssafy;
//
//import java.util.Scanner;
//
//public class Test {
//	
//	static long Answer;
//	static int N, S;
//	
//	public static void main(String[] args) throws Exception {
//
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();		//테스트 케이스 수  
//		
//		for(int test_case=1; test_case<=T; test_case++){
//			
//			N = sc.nextInt(); 	//배열의 크기 NxN
//			int[][] lake = new int[N][N];	//default 0, 
//			
//			S = sc.nextInt();	//소금쟁이(Strider)수
//			int[][] strider = new int[S][3];
//			
//			for(int k=0; k<S; k++){
//				strider[k][0]=sc.nextInt();//행위치
//				strider[k][1]=sc.nextInt();//열위치
//				strider[k][2]=sc.nextInt();//방향(1:하,2:우)
//			}
//
//			Answer=0;
//			int k=0;
//			
//			for(k=0; k<S; k++){
//				int pi = strider[k][0];  //시작 위치 i
//				int pj = strider[k][1];  //시작 위치 j
//				int dir = strider[k][2]; //방향
//				
//				if(pi>=0 && pi<N && pj>=0 && pj<N){
//					
//					if(lake[pi][pj]==1) break;  //이미 누군가 뛴 자리라면
//					
//					lake[pi][pj]=1;  // 뛴 흔적 저장
//					
//					if(dir==1){//1.하
//						
//						boolean isBreak = false;
//						for(int x=3; x>=1; x--){
//							pi=pi+x;
//							if(pi<N){//3칸
//								if(lake[pi][pj]==1) {
//									isBreak = true;
//									break;//이미 누군가 뛴 자리라면
//								}
//								lake[pi][pj]=1;							
//							}
//						}
//						if( isBreak ) break;
//						
//					}else{//2.우
//						
//						boolean isBreak = false;
//						for(int x=3; x>=1; x--){
//							pj=pj+x;
//							if(pj<N){//3칸
//								if(lake[pi][pj]==1) {
//									isBreak = true;
//									break;//이미 누군가 뛴 자리라면
//								}
//								lake[pi][pj]=1;							
//							}
//						}
//						
//						if( isBreak ) break;
//					}
//				}
//			}
//			
//			if(k<S) Answer=k+1;
//			System.out.println("#"+test_case+" "+Answer);
//		}
//	}
//}
//
//
//// 사용자 입력
//3
//9 5
//6 2 2
//1 5 1
//0 0 2
//1 0 1
//2 4 2
//11 6
//0 0 2
//1 0 1
//2 4 2
//6 2 2
//1 5 1
//8 3 2
//7 5
//6 2 2
//1 6 1
//0 0 2
//1 0 1
//2 4 2
//
//// 결과
//#1 2
//#2 5
//#3 0