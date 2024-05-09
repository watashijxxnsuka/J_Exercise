package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지 곱한 값을 구하세요. (100 팩토리얼, 100!)
		
		BigInteger bigInteger1 = BigInteger.ONE;
		
		for (int i = 1; i <= 100; i++) {
			bigInteger1 = bigInteger1.multiply(bigInteger1.valueOf(i));
		}
		
		System.out.println(bigInteger1);
		
//		long num = factorial(10);
//		
//		System.out.println(num);
		
		System.out.println(factorialBigInteger(BigInteger.valueOf(100l)));
		
		// 1! = 1
		// 2! = 2
		// 3! = 6
		// .. 
		// 100! = 933............
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.println(i + "! = " + factorialBigInteger(BigInteger.valueOf(i)));
			
		}
				
		
		
	}
	
//	public static long factorial(long num) {
//		if(num == 0) {
//			return 1;
//		} else {
//			// 재귀메소드: 현재 메소드를 구현부안에서 호출
//			// num = 10이 들어오면
//			// 10 * factorial(9)
//			// 10 * 9 * factorial(8)
//			// 10 * 9 * 8 * factorial(7)
//			// .. . . .
//			// 10 * 9 * 8 * 7 * .... * factorial(0)
//			
//			return num * factorial(num-1);
//		}
//	}
	
	public static BigInteger factorialBigInteger(BigInteger bigInt) {
		
		if (bigInt.intValue() == 0) {
			return BigInteger.ONE;
		} else {
			return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.ONE)));
		}
	}
	
	
//	public static BigInteger factorial(int n) {
//		BigInteger result = BigInteger.ONE;
//		for(int i = 1; i <= n; i++) {
//			result = result.multiply(BigInteger.valueOf(i));
//		}
//		return result;
//	}
//	
	
	
	
}
