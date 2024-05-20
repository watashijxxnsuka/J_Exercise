package chap24_dataio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _06_Reader {
	public static void main(String[] args) {
		
		try {
		Reader reader = new FileReader(
				"C:/lecture/Java/JavaProgramming/src/chap24_dataio/Writer.txt"
				);
			
			// 2. 모든 문자를 읽기 위한 while 문 선언
			while(true) {
				int data = reader.read();
				
				// 3. 더이상 읽을 데이터가 없으면 -1 리턴
				if(data == -1) {
					break;
				}
				
				System.out.println((char)data);
			}
			
			// 4. 스트림이 한번 닫히면 다시 사용할 수 없다.
			reader.close();
			
			reader = new FileReader(
					"C:/lecture/Java/JavaProgramming/src/chap24_dataio/Writer.txt"
					);
			
			// 5. 문자배열로 입력받기
			char[] readData = new char[60];
			
			while(true) {
				// 읽어들인 문자 개수를 리턴해주는 read 메소드
				int cnt = reader.read(readData);
				
				if(cnt == -1) {
					break;
				}
				
				System.out.println("읽어들인 문자 개수: " + cnt);
				for(char c : readData) {
					System.out.print(c + ", ");
				}
			}
			
			reader.close();
				
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		
	}

}
