package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _10_HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList2 = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		List<Integer> cntList = new ArrayList<>();
		
		List<Integer> valueList = new ArrayList<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		System.out.println(sumList);
		
		
		
		
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						sumCnt++;
					}
				}
			}
		
			intMap.put(String.valueOf(sumList.get(i)), sumCnt);
			
		}
		
		
		System.out.println(intMap);
		
		Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		int cnt = 0;
		
		System.out.print("합이 유일한 합의 값: ");
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + ", ");
				cnt++;
			}
		}
		
		System.out.println("유일한 합의 개수: ");
		
		
		
		
		sc.close();
	}
}



