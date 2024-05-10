package chap18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _07_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Map 객체 생성
		// Map 은 Key, Value 쌍으로 데이터(엔트리)가 저장되기 때문에
		// 제네릭타입도 Key, Value 두개를 지정해야 한다.
		Map<String, String> carMap = new HashMap<>();
		
		
		// 2. Map 에 데이터 추가
		// put(key, value): key 와 value 한 쌍의 엔트리를 생성해서 Map 에 저장
		// key, value 모두 Map 을 생성할 때 지정한 제네릭타입의 값을 넣어줘야 한다.
		
		// carMap 의 형태
		/*
		 * {
		 *  	company: 현대,
		 * 		model: 제네시스,
		 * 		price: 5000,
		 *		color: 블랙
		 *
		 * }
		 * 
		 */
		carMap.put("company", "현대");
		carMap.put("model", "제네시스");
		carMap.put("price", "5000");
		carMap.put("color", "블랙");
		
		
		System.out.println(carMap);
		
		// 3. value 는 중복 값이 허용되고, key 는 중복 값이 허용되지 않는다.
		carMap.put("discountPrice", "5000");
		carMap.put("color", "레드");
		
		System.out.println(carMap);
		
		
		// 4. key 값에 매핑된 value 값 가져오기
		// get(key)
		System.out.println(carMap.get("company"));
		System.out.println(carMap.get("discountPrice"));
		
		
		// 5. key 값을 모를 때 
		// KeySet 메소드를 통해 key 의 값 가져오기
		// set<key>
		
		Set<String> keySet = carMap.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key);
			System.out.println(carMap.get(key));
		}
		
		// 6. entrySet 활용
		// key, value 값을 모두 모르는 상태이고, 다 확인하고 싶은 경우
		
		/*
		 * entrySet 메소드를 사용하면 Set<Entry> 형태로 리턴되고,
		 * Set<Entry>의 형태는
		 * [
		 * 
		 * 		{company: 현대},
		 * 		{model: 제네시스},
		 * 		{price: 5000},
		 * 		{color: 블랙}
		 * 
		 * ]
		 **/
		
		Set<Entry<String, String>> entrySet = carMap.entrySet();
		
		Iterator<Entry<String, String>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, String> entry = entryIterator.next();
			
			// Entry 의 getKey, getValue 메소드
			// getKey: Entry 객체에 담겨있는 Key 를 리턴하는 메소드
			// getValue: Entry 객체에 담겨있는 Value 를 리턴하는 메소드
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			if(entry.getKey().equals("price")) {
				// setValue: Entry 객체에 담겨있는 Value 값 변경
				entry.setValue("6000");
			}
		}
	
		System.out.println(carMap);
		
	}
}
