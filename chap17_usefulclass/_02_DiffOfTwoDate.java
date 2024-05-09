package chap17_usefulclass;

import java.util.Calendar;

public class _02_DiffOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2019, 2, 11);
		
		
		// getTimeInMills(): 현재 날씨 시간을 밀리세컨트로 변환(long)
		// 두 날짜의 차이 = 날짜1.getTimeInMills() - 날짜2.getTimeInMills() (long) 밀리초
		
		long diff = cal1.getTimeInMillis() -  cal2.getTimeInMillis();
		
		System.out.println("cal2부터 cal1까지 " + (diff / 1000) + "초가 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60) + "분이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60) + "시간 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24) + "일이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24 / 30) + "개월이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24 / 30 / 12) + "년이 지났습니다.");
		
		// diff가 몇년 몇일 몇시간 몇분 몇초가 지났는지 표시하세요.
		
		long diffYear = diff / ((long)1000 * 60 * 60 * 24 * 365);
		diff %= ((long)1000 * 60 * 60 * 24 * 365);
		long diffDate = diff / ((long)1000 * 60 * 24 * 365);
		diff %= ((long)1000 * 60 * 60 * 24); 
		long diffTime = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		long diffMin = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		long diffSec = diff / ((long)1000);
		
		System.out.println("cal2부터 cal1까지 " + diffYear + "년 "
				+ diffDate + "일 " + diffTime + "시간 "
					+ diffMin + "분 " + diffSec + "초가 지났습니다."
				
				);
		
		
//		System.out.println(
//				  (diff / 1000 / 60 / 60 / 24 / 30 / 12) + "년 " 
//				+ (diff / 1000 / 60 / 60 / 24 / 30) + "개월 "
//				+ (diff / 1000 / 60 / 60 / 24) + "일 "
//				+ (diff / 1000 / 60 / 60) + "시간 "
//				+ (diff / 1000 / 60) + "분 "
//				+ (diff / 1000) + "초 가 지났습니다."
//				);
		
		
		
	}

}
