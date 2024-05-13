package chap20_enum.enums;

public enum MethodMonth {
	// 1. enum 에 값 지정
	// 상수명(지정할 값)
	// 첫번째 지정된 값의 타입과 동일한 타입의 값을 계속해서 지정해야 한다.
	
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), 
	Jul(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	
	// 2. 상수에 지정된 값을 받아줄 변수 선언 (항상 private 로 선언한다.)
	// 변수가 private 으로 선언되기 때문에 getter/setter 메소드를 항상 정의한다.
	// 생성자에서 해당 상수 값으로 초기화가 될 수 있도록 한다.
	private int monthValue;
	
	
	// 3. 생성자 선언
	// enum 객체를 생성할 때 valueOf 메소드나 enum 클래스원형.상수명 으로 생성을 하게 되는데,
	// 지정된 상수명에 해당하는 생성자가 자동으로 호출
	// ValueMonth valueMonth = ValueMonth.JAN;
	MethodMonth(int monthValue) {
		this.monthValue = monthValue;
	}
	
	// 4. getter 메소드 선언, 상수의 값을 리턴해주는 메소드
	public int getMonthValue() {
		return this.monthValue;
	}

	void printMonth(int i) {
		// TODO Auto-generated method stub
		
	}
	

}
