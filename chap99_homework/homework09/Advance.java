package chap99_homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		Map<Character, Integer> chMap = 
				new HashMap<Character, Integer>();
		
		for(int i = 0; i < input.length(); i++) {
			if(i == 0) {
				chMap.put(input.charAt(i), 1);
			} else {
				Set<Entry<Character, Integer>> entrySet = 
										chMap.entrySet();
				Iterator<Entry<Character, Integer>> it = 
										entrySet.iterator();
				int cnt = 0;
				char key = 0;
				while(it.hasNext()) {
					Entry<Character, Integer> ent = 
												it.next();
					//iterator.next()로 객체를 꺼내와서
					//그 내용을 변경하게 되면 iterator가 인식하지 못하게
					//되어 에러발생
					if(ent.getKey() == input.charAt(i)) {
						key = ent.getKey();
						cnt = ent.getValue();
						//System.out.println(ent.getKey() + " : " + ent.getValue());
						break;
					} 
				}
				
				if(key != 0 && cnt != 0) {
					chMap.put(key, ++cnt);
				} else {
					chMap.put(input.charAt(i), 1);
				}
				
			}
		}
		
		System.out.println(chMap);

		sc.close();
	}

}
