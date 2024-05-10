package chap18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _05_HastSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Set 객체 생성
		
		Set<String> strSet = new HashSet<>();
		
		
		// 2. Set 데이터 추가
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("JavaScript");
		strSet.add("HTML/CSS");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		
		// 3. Set 중복 데이터 추가
		strSet.add("Java");
		strSet.add("JDBC");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		
		// 4. Set 은 데이터의 순서가 없기 때문에 인덱스로 데이터에 접근할 수 있는 방법이 없다.
		// Collection 의 Iterator 를 이용해서 Set 에 담겨있는 데이터에 하나씩 접근해서 사용한다.
		// Iterator 객체를 생성할 때는 Collection 이 생성된 제네릭 타입과 동일하게 지정해야 한다.
		
		Iterator<String> iterator = strSet.iterator();
		
		// Iterator 의 hasNext(): 데이터가 남아있는지 검사하는 메소드. 
		//						 남아있으면 true, 없으면 false
		
		while(iterator.hasNext()) {
			// Iterator 의 next(): Iterator 객체를 생성할 때 지정한 제네릭타입의 값을 하나씩 꺼내주는 메소드
			String str = iterator.next();
			
			System.out.println(str);
		}
		
		
		// 5. 특정 값 제거
		
		strSet.remove("Java");
		strSet.remove("C");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		
		// 6. Set 비우기
		
		strSet.clear();
		
		System.out.println(strSet.size());
		
		
		
	}

}
