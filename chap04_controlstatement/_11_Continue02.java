package chap04_controlstatement;

import java.util.Scanner;

public class _11_Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료.
		// 2~9까지의 숫자만 입력할 수 있도록 한다. 다른 숫자를 입력하면 continue를 이용해서 다시 숫자를 입력하도록 한다.
		
        Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.(0) 입력시 종료");
				
			int userNum = sc.nextInt();
				
			if(userNum ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(userNum <2 || userNum >9) {
				System.out.println("2~9사이의 숫자를 입력하세요.");
				continue;
			}
			
			
			
			for(int i=2; i<= userNum; i++) {
				System.out.println("단");
				for (int k=1; k<=9; k++) {
					System.out.println(i + "*" + k + " = " + (i*k));
				}
					
				}
			}
			
			sc.close();
			
			}

	}


