package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import chap23_stream.car.HyundaiCar;

public class _16_CountingMethodEx {
	public static void main(String[] args) {
		
		//List<HyundaiCar> 생성하고
		// 아반떼, 3000 
		// 아반떼, 3500 
		// 아반떼, 2500 
		// 소나타, 4000	 
		// 그렌저, 5000 
		// 제네시스, 6000 
		
		// 스트림처리를 통해서 가격이 최대값인 객체 하나와
		// 가격이 최소값이 객체 하나를 찾아서 출력하세요. 
		
		List<HyundaiCar> hCarList = new ArrayList<>();
		
		hCarList.add(new HyundaiCar("아반떼", 3000));
		hCarList.add(new HyundaiCar("아반떼", 3500));
		hCarList.add(new HyundaiCar("아반떼", 2500));
		hCarList.add(new HyundaiCar("소나타", 4000));
		hCarList.add(new HyundaiCar("그렌저", 5000));
		hCarList.add(new HyundaiCar("제네시스", 6000));
		
		HyundaiCar maxCar = hCarList.stream()
				.max(Comparator.<HyundaiCar, Integer>comparing(hyundaiCar -> hyundaiCar.getPrice()))
				.orElseThrow();
		
		maxCar.carInfo();
		
		
		HyundaiCar minCar = hCarList.stream()
				.min(Comparator.<HyundaiCar, Integer>comparing(hyundaiCar -> hyundaiCar.getPrice()))
				.orElseThrow();

		minCar.carInfo();
									
									
									
//		IntStream MaxCar = hCarList.stream()
//				 .mapToInt(car -> car.getPrice());
//		
//		int max = hCarList.stream()
//				.mapToInt(car -> car.getPrice())
//				.max()
//				.getAsInt();
//		
//		int min = hCarList.stream()
//				.mapToInt(car -> car.getPrice())
//				.min()
//				.orElseThrow();
//		
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
//		
	}

}
