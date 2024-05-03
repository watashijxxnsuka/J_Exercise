package chap99_homework.homework04;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int[] returnArr = new int[s1.length + s2.length];
		
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			returnArr[index++] = s1[i];
		}
		
		for(int i = 0; i < s2.length; i++) {
			returnArr[index++] = s2[i];
		}
		
		return returnArr;
	}
	//s1 = {1, 2, 3}
	//s2 = {2, 4, 5}
	//s3 = {1, 3} new int[s1.length - 중복개수]
	public static int[] remove(int[] s1, int[] s2) {
		
		int[] indexArr = new int[s1.length];
		
		int index = 0;

		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					indexArr[index++] = i;
	
					break;
				}
			}
		}
		
		int[] returnArr = new int[s1.length - index];
		
		index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			boolean isDup = false;
			
			for(int j =0 ; j < index; j++) {
				if(i == indexArr[j]) {
					isDup = true;
					break;
				}
			}
			
			if(isDup) {
				continue;
			}
			
			returnArr[index++] = s1[i];
		}
		
		return returnArr;
	}
}
