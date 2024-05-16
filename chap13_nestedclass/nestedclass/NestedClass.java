package chap13_nestedclass.nestedclass;

// 중첩클래스는 클래스안에 다른 클래스를 하나 더 정의하는 것
// 중첩클래스를 감싸고 있는 클래스를 외부클래스라고 부르며, 중첩클래스는 내부클래스라고도 한다.
// 중첩클래스의 종류는 정적 중첩클래스, 인스턴스 중첩클래스, 지역 중첩클래스, 익명 중첩클래스가 있다.
public class NestedClass {
	// 1. 멤버변수(인스턴스 변수, 어트리뷰트, 속성,....)
	private int num1;
	public int num2;
	
	// 2. 클래스변수(정적변수, 스태틱변수)
	public static int num3;
	
	// 3. 인스턴스 메소드
	private int add(int a, int b) {
		return a + b;
	}
	
	// 4. 클래스 메소드(스태틱메소드, 정적메소드)
	public static int sub(int a, int b) {
		return a - b;
	}
	
	// 5. 정적 중첩클래스(스태틱 중첩클래스)
	// 외부클래스의 static 키워드로 생성된 변수와 메소드에만 접근할 수 있다.
	// 중첩클래스 자체가 static으로 컴파일러가 메모리에 바로 올라가고,
	// 외부클래스의 멤버변수나 인스턴스 메소드는 객체가 생성된 후에 사용할 수 있기 때문이다.
	// 외부클래스의 객체생성 없이도 객체를 만들 수 있다.
	public static class Mul {
		// 5-1. 정적 중첩클래스의 멤버변수
		public int num4;
		public int num5;
	
		
		// 5-2. 정적 중첩클래스의 클래스변수
		public static int num6;
		
		// 5-3. 정적 중첩클래스의 인스턴스메소드
		public int mul(int a, int b) {
			// 외부클래스의 클래스변수 및 클래스메소드에 접근
			num3 = 10;
			a = sub(num3, 5);
			return a * b;
		}
		
		// 5-4. 정적 중첩클래스의 클래스메소드
		public static int Mul(int a, int b) {
			return a * b;
		}
		
	}
	
	// 6. 인스턴스 중첩 클래스
	// 외부클래스의 객체가 생성된 후에 객체를 만들 수 있다.
	// 외부클래스의 모든 인스턴스 변수와 메소드에 접근이 가능하다.
	public class Div {
		// 6-1. 인스턴스 중첩클래스의 멤버변수
		public int num7;
		public int num8;
		
		// 6-2. 인스턴스 중첩클래스의 클래스변수
		public static int num9;
		
		// 6-3. 인스턴스 중첩클래스의 인스턴스 메소드
		public double div(int a, int b) {
			
			// 외부클래스의 인스턴스 변수와 메소드에 접근
			num1 = 20;
			a = add(num1,10);
			// 외부클래스의 클래스 변수와 메소드에 접근
			num3 = 30;
			b = sub(num3,10);
			
			return (double) a / b;
		}
		
		// 6-4. 인스턴스 중첩클래스의 클래스메소드
		public static double staticDiv(int a, int b) {
			return (double) a / b;
		}
	}
	
	

}
