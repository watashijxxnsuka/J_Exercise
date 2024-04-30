package chap06_method.calc;

public class CompleteCalculator {
	// int형 매개변수 2개를 받는 메소드 add(+), sub(-), mul(*), div(/), mod(%)를 구현하세요.
	// 접근제어자는 모두 public으로 생성하고 div메소드의 리턴타입만 double 
	// 나머지 메소드는 int로 지정하세요.
	// div와 mod의 두 번째 매개변수가 분모이고 분모에 0이 들어오면 0을 리턴하세요.
	
	public int add(int a, int b) {
		// return문은 결과값을 반환하는 의미도 있지만 메소드의 종결을 의미하기도 한다.
		// return문 뒤에 코드는 실행되지 않는다.
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public double div(int a, int b) {
		if(b == 0) 
			return 0;
		return (double)a / b;
	}
	
	public int mod(int a, int b) {
		if(b == 0) 
			return 0;
	    return  a % b;
	} 
	
	
}
