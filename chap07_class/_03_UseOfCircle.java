package chap07_class;

import chap07_class.circle.Circle;

public class _03_UseOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(15);
		
		System.out.println(circle.radius);
		System.out.println(circle.circumference());
		System.out.println(circle.area());
		
	}

}
