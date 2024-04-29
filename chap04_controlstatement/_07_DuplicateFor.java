package chap04_controlstatement;

import java.net.MulticastSocket;

public class _07_DuplicateFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 중첩 for문
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				System.out.println("i: " + i + " , j ; " + j);
			}
			System.out.println("i값 증가");
		}
		
		// 2. 2 ~ 9단까지 구구단 출력
		
		for (int k = 2; k <= 9; k++) {
			System.out.println(k + "단 시작");
			for (int l = 1; l <= 9; l++) {
				System.out.print(k + " * " + l + " = " + (k*l) + "    ");
			}
			System.out.println(k +"단 끝");
		
		}
		
		// 3. 
		// *****
		// *****
		// *****
		// *****
		// *****
		// 위 모양대로 출력할 수 있는 중첩 for 문을 작성하세요.
		
//		for (int j = 5; j<=5; j++) {
//			System.out.println("*****");
//			for (int m = 1; m <=4; m++) {
//				System.out.println("*****");
//			}
//			System.out.println("end");
//	}
		for (int i =0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
			
			
		// 4. AB + BA == 99를 만족하는 A,B 값을 모두 출력하는 중첩 for문을 작성하세요.(A,B는 0~9까지의 정수)	
		
		for (int A = 1; A <= 9; A++ ) {
			for (int B = 1; B <= 9; B++) {
				
				if ((A*10 + B) + (B*10 + A) == 99 ) {
					System.out.print("A의값은 :" +A);
					System.out.println(", B의값은 :" +B);
					System.out.println((A*10 + B) + " + " + (B*10 + A) + " = 99");
				}
				
//		for (int C = 0; C <= 9; C++) {
//			for (int D = 0; D<=9; D++) {
//				int numAB = C*10 + D;
//				int numBA = D*10 + C;
//				
//				if (numAB +numBA == 99) {
//					System.out.print("C :" + C + " , D: " + D);
				
			}
				
			}
				
			} 
		

	}

