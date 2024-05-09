package chap17_usefulclass;

import java.util.Calendar;
import java.util.Scanner;

public class _05_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		int year = sc.nextInt();
		
//		int year = 2024;
//		boolean isLeap = isLeapYear(year);
		
		if(isLeapYear(year)) {
			System.out.println(year + "년은 윤력입니다.");
		} else {
			System.out.println(year + "년은 윤력이 아닙니다.");
		}
		
		sc.close();
		
	}
	public static boolean isLeapYear(int year) {
		// 윤년의 조건
		// 년도가 400으로 나누어 떨어지거나 
		// 4로는 나누어 떨어지고, 100으로는 나누어 떨어지지 않는 년도.
		
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}

}
