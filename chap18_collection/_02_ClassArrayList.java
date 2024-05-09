package chap18_collection;

import java.util.ArrayList;
import java.util.List;

import chap14_objectarray.car.Car;

public class _02_ClassArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [1, 2, 3, 4, 5]
		List<Integer> intList = new ArrayList<>();
		
		
		
		/*
		 * [
		 * 		{
		 * 			company: "현대",
		 * 			model: "제네시스",
		 * 			price: 5000,
		 * 			color: "블랙",
		 * 			메소드들 ......
		 * 		},
		 * 
		 * 		{
		 * 			company: "기아",
		 * 			model: "k9",
		 * 			price: 5000,
		 * 			color: "그린",
		 * 			메소드들 ......
		 * 		},
		 * 		......
		 * 
		 * 	]
		 * 
		 */
		
		List<Car> carList = new ArrayList<>();

		carList.add(new Car("현대", "제네시스", 5000, "블랙"));
		carList.add(new Car("기아", "k9", 5000, "그린"));
		
		System.out.println(carList);
		
		// List 에 있는 데이터를 하나씩 꺼낼 때에는 get(int index) 메소드를 사용한다.
		for(int i = 0; i < carList.size(); i++) {
			carList.get(i).carInfo();
		}
		
		// List 에서도 향상된 for 문을 사용가능.
		for(Car c : carList) {
			c.carInfo();
		}
		
		
		
	}

}
