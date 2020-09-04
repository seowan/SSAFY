//// 기본 문제 #08
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		int i;
//		
//		System.out.println(i);
//	}
//}
//
//// 기본 문제 #09
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		{
//			int i = 0;
//			System.out.println(i);
//		}
//		
//		System.out.println(i);
//	}
//}
//
//// 기본 문제 #10
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		final int i = 0;
//		System.out.println(i);
//		
//		i = 10;
//		System.out.println(i);
//	}
//}
//
//// 기본 문제 #11
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		// A
//		{
//			int i = 10;
//			byte b = i;
//		}
//		
//		// B
//		{
//			byte b = 10;
//			int i = b;
//			
//		}
//	}
//}
//
//// 기본 문제 #14
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int k = 66;
//		char c = (char) k;
//		System.out.println(c);
//		
//		c = 'A';
//		k = c;
//		System.out.println(k);
//		
//		int i = 10 / 3;
//		System.out.println(i);
//	
//		float f = 10 / 3;
//		System.out.println(f);
//		
//		float f2 = 10f / 3F;
//		System.out.println(f2);
//
//		double d = 10d / 3D;
//		System.out.println(d);
//		
//		System.out.println( ( 10 / 3 ) * 3 ); 
//	}
//}
//
//
//// 기본 문제 #16
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		// bit and
//		System.out.println("3 & 4 = " + (3 & 4));
//		//   0011
//		// & 0100
//		// ------
//		//   0000
//		
//		// bit or
//		System.out.println("3 | 4 = " + (3 | 4));
//		//   0011
//		// | 0100
//		// ------
//		//   0111
//		
//		// bit exclusive
//		System.out.println("3 ^ 4 = " + (3 ^ 4));
//		//   0011
//		// ^ 0100
//		// ------
//		//   0111
//		
//		// bit not
//		System.out.println(" ~ 4 = " + (~ 4));
//		//   0100
//		// ~
//		// ------
//		//   1011
//	}
//}
//
//// 기본 문제 #17
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		// <<
//		System.out.println("1 << 2 = " + (1 << 2));
//		//    .... 0000 0001
//		// << .... 0000 0100
//
//		System.out.println("3 << 3 = " + (3 << 3));
//		//    .... 0000 0011
//		// << .... 0001 1000
//		
//		
//		// >>
//		System.out.println("1 >> 2 = " + (1 >> 2));
//		//	  .... 0000 0001
//		// >> .... 0000 0000
//		
//		System.out.println("-16 >> 2 = " + (-16 >> 2));
//		//	  .... 1111 0000
//		// >> .... 1111 1100
//		
//		// >>>
//		System.out.println("7 >>> 2 = " + (7 >>> 2));
//		//	   0000 .... 0000 0111
//		// >>> 0000 .... 0000 0001
//		
//		System.out.println("-5 >>> 24 = " + (-5 >>> 24));
//		//	   1111 1111 1111 1111 1111 1111 1111 1001
//		// >>> 0000 0000 0000 0000 0000 0000 1111 1111
//	}
//}
//
//// 기본 문제 #18
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		int N = 6;
//		
//		// Math.random()
//		System.out.printf( "%3d", (int) (Math.random()*N) + 1 );
//		
//		// java.util.Random
//		java.util.Random generator = new java.util.Random();
//		System.out.printf( "%3d", generator.nextInt(N) + 1 );
//		
//		// %
//		System.out.printf( "%3d", ( (int) (Math.random()*100) % N ) + 1 );
//	}
//}
//
//// 기본 문제 #19
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		int N = 6;
//		int result = (int) (Math.random()*N) + 1;
//		
//		if( result == 1 ) {
//			// do something
//		}else if( result == 2 ) {
//			// do something
//		}else if( result == 3 ) {
//			// do something
//		}else if( result == 4 ) {
//			// do something
//		}else if( result == 5 ) {
//			// do something
//		}else if( result == 6 ) {
//			// do something
//		}else {
//			// do something
//		}
//	}
//}
//
//// 기본 문제 #20
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		int N = 6;
//		int result = (int) (Math.random()*N) + 1;
//		
//		switch( result) {
//			case 1 : // do something
//					 break;
//			case 2 : // do something
//				 	 break;
//			case 3 : // do something
//				 	 break;
//			case 4 : // do something
//				 	 break;
//			case 5 : // do something
//				 	 break;
//			case 6 : // do something
//				 	 break;
//			default : // do something
//		}
//	}
//}
//
//
//// 기본 문제 #21
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int num = 4;
//		
//		if( num == 3 & isEven(num) ) {
//			System.out.println("3 !!");
//		}
//	}
//	
//	static boolean isEven(int num) {
//		if( num % 2 == 0 ) {
//			System.out.println("Even !!");
//			return true;
//		}else {
//			return false;
//		}
//	}
//}
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int num = 4;
//		
//		if( num == 3 && isEven(num) ) {
//			System.out.println("3 !!");
//		}
//	}
//	
//	static boolean isEven(int num) {
//		if( num % 2 == 0 ) {
//			System.out.println("Even !!");
//			return true;
//		}else {
//			return false;
//		}
//	}
//}
//
//
//// 기본 문제 #22
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		int num = 3;
//		
//		switch( num ) {
//			case 1 : System.out.println(num);
//			case 2 : System.out.println(num);
//			case 3 : System.out.println(num);
//			case 4 : System.out.println(num);
//			case 5 : break;
//			case 6 : break;
//			default : System.out.println(num);
//		}
//	}
//}
//
//// 기본 문제 #23
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		int I = 3;
//		byte B = 3;
//		short S = 3;
//		char C = 'C';
//		double D = 3.0d;
//		String str = "STR";
//		
//		switch(  ) {
//			
//		}
//	}
//}
//
//// 기본 문제 #24
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		boolean isEven = ( N % 2 == 0 ) ? true : false;
//		
//		N = ( ! isEven ) ? 10 : 20;
//		
//		System.out.println(N);
//	}
//}
//
//
//// 기본 문제 #25 -1
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int result = (int) (Math.random()*N) + 1;
//		System.out.println(result);
//		boolean isEven = false;
//		if ( result % 2 == 0 ) {
//			isEven = true;
//		}
//		
//		result = (int) (Math.random()*N) + 1;
//		System.out.println(result);
//		if ( result % 2 == 0 ) {
//			if( isEven ) {
//				System.out.println("A");
//			}else {
//				System.out.println("B");
//			}
//		}else if ( result % 2 == 1 ) {
//			if( isEven ) {
//				System.out.println("B");
//			}else {
//				System.out.println("A");
//			}
//		}
//	}
//}
//
//// 기본 문제 #25-2
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int result = (int) (Math.random()*N) + 1;
//		System.out.println(result);
//		boolean isEven = ( result % 2 == 0 ) ? true : false;
//		
//		result = (int) (Math.random()*N) + 1;
//		System.out.println(result);
//		boolean isSame = ( ( result % 2 == 0 ) == isEven ) ? true : false;
//		
//		if( isSame ) {
//			System.out.println("A");
//		}else {
//			System.out.println("B");
//		}
//	}
//}
//
//// 기본 문제 #25-3
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		int result1 = (int) (Math.random()*N) + 1;
//		System.out.println(result1);
//		
//		int result2 = (int) (Math.random()*N) + 1;
//		System.out.println(result2);
//		
//		if( ( result1 + result2 ) % 2 == 0 ) {
//			System.out.println("A");
//		}else {
//			System.out.println("B");
//		}
//	}
//}
//
//
//// 기본 문제 #26
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		float result = 0;
//		
//		for( int i=0; i<100; i++ ) {
//			result += (int) (Math.random()*N) + 1;
//		}
//		
//		System.out.println(result);
//		System.out.println(result / 100);
//	}
//}
//
//// 기본 문제 #27
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		float result = 0;
//		
//		int i=0;
//		
//		while(  i<100 ) {
//			result += (int) (Math.random()*N) + 1;
//			i++; 
//		}
//		
//		System.out.println(result);
//		System.out.println(result / 100);
//	}
//}
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		int N = 6;
//		
//		float result = 0;
//		
//		int i=0;
//		
//		do {
//			result += (int) (Math.random()*N) + 1;
//			i++; 
//		}while(  i<100 );
//		
//		System.out.println(result);
//		System.out.println(result / 100);
//	}
//}
//
//// 기본 문제 #29
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		for( int i=0; i<2; i++ ) {
//			
//			for( int j=0; j<10; j++ ) {
//				
//				if( j==5 ) break;
//				if( j==3 ) continue;
//				
//				System.out.println(j);
//			}
//		}
//	}
//}
//
//
//// 기본 문제 #30
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//
//		for( int i=0; i<5; i++ ) {
//			
//			for( int j=0; j<i; j++ ) {
//				
//				if( j==3 ) break;
//				if( j==2 ) continue;
//				
//				System.out.println(j);
//			}
//		}
//	}
//}
//
//// 기본 문제 #31
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		int N = 6;
//		
//		int result = 0;
//		int count = 0;
//		
//		while(true) {
//			count++;
//			result += (int)(Math.random()*N) + 1;
//			if( result > 100 ) break;
//		}
//		
//		System.out.println(count);
//		System.out.println(result);
//	}
//}
//
//// 기본 문제 #32-1
//
//package com.ssafy;
//
//public class Test {
//	public static void main(String[] args) {
//		
//		for( int i=0; i<5; i++ ) {
//			for( int j=0; j<5; j++ ) {
//				if( j<=i) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//	}
//}


// 기본 문제 #32-2

package com.ssafy;

public class Test {
	public static void main(String[] args) {
		
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}