package chap24_dataio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _13_Files {
	public static void main(String[] args) {
		
		try {
			String data = "이름: 한서준\n전화번호: 010-1111-1111";
			
			// 1. Files 클래스의 메소드는 static 으로 선언되어 있어서 객체 생성없이 사용가능하다.
			// 매개변수로 Path 객체를 받기 때문에 Path 객체를 먼저 생성해야한다.
			Path path = Paths.get("C:", "lecture", "Java", "JavaProgramming", "src",
							"chap24_dataio","FilesClass.txt");
			
			// 2. 파일 생성 및 데이터 저장
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			// 3. 파일의 타입 출력
			// .txt => tex/plain
			// .jpg, .jpeg => image/jpeg
			// .gif => image/gif
			// probeContentType(Path 객체): 전달받은 Path 객체가 어떤 타입의 파일인지 String 으로 리턴
			System.out.println(Files.probeContentType(path));
			
			// 4. size(Path 객체): Path 객체의 파일 바이트 단위의 크기를 리턴
			System.out.println(Files.size(path));
			
			// 5. 파일 읽기
			// readString(Path 객체, Charset): 파일을 지정된 Charset의 String 으로 리턴
			String content = Files.readString(path, Charset.forName("UTF-8"));
			
			System.out.println(content);
			
			
			
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		
	}

}
