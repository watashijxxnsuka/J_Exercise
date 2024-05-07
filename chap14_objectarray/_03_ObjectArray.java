package chap14_objectarray;

import chap14_objectarray.car.CarInterface;
import chap14_objectarray.car.HyundaiCar;

public class _03_ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 최상의 클래스인 Object로 배열을 만들면 
		// 자바의 모든 타입의 값을 담을 수 있는 배열을 만들 수 있다.
		
		Object[] objArr = new Object[100];
		
		objArr[0] = new HyundaiCar("제네시스", 5000, "검정");
		objArr[1] = "aaa";
		objArr[2] = 1000;
		objArr[3] = new int[100];
		
		// 사용시에는 변환하는 과정이 필요하다.
		CarInterface carInterface = (CarInterface)objArr[0];
		carInterface.carInfo();
		
		String str = (String)objArr[1];
		System.out.println(str);
		
		int intValue = (Integer)objArr[2];
		System.out.println(intValue);
	}

}
