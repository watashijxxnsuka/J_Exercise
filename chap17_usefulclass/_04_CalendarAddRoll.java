package chap17_usefulclass;

import java.util.Calendar;

public class _04_CalendarAddRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. add 메소드: Calendar 객체에 날짜를 더해주는 메소드
		// add 메소드(더해줄 위치(Calendar.YEAR, Calendar.MONTH, Calendar.DATE), 더할 날짜)
		// add 메소드는 다음 단위에도 영향을 준다.
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.add(Calendar.DATE, 5);
		printCalendar(calendar);
		
		calendar.add(Calendar.DATE, 30);
		printCalendar(calendar);
		
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 5);
		printCalendar(calendar);
		
		// 2. roll 메소드
		// roll 메소드도 add 메소드와 마찬가지로 날짜를 더해주는 메소드.
		// roll 메소드는 다음 단위에 영향을 미치지 않는다.
		
		calendar.roll(Calendar.DATE, 31);
		printCalendar(calendar);
	
		

	}
	
	public static void printCalendar(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "년 " +
				(cal.get(Calendar.MONTH) + 1) + "월 " +
				cal.get(Calendar.DATE) + "일");
	}

}
