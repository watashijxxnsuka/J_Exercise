package chap24_dataio;

import java.io.File;

public class _12_FileClass {
	public static void main(String[] args) {
		
		try {
			// 1. File 객체 생성
			// 생성자에 경로만 지정해도 되고 파일명까지 지정해도 된다.
			File newDirectory = new File("C:/lecture/Java/newDirectory");
			File newFile = new File("C:/lecture/Java/newDirectory/FileClass.txt");
			
			// 2. 폴더가 존재하지 않으면 폴더 생성
			// file 객체의 exists() 메소드: 해당 파일이나 폴더가 존재하면 true, 존재하지 않으면 false 리턴
			if(!newDirectory.exists()) {
				// mkdir() 메소드: 폴더를 생성하는 메소드
				newDirectory.mkdir();
			}
			// 3. 파일이 존재하지 않으면 파일 생성
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
			// 4. 디렉토리에 포함된 폴더, 파일목록 가져오기
			File path = new File("C:/lecture/Java");
			
			File[] fileArr = path.listFiles();
			
			for(File file : fileArr) {
				System.out.println(file.getName());
			}
			
			// 5. 파일 삭제
			
			boolean isDelete = newFile.delete();
			
			if(isDelete) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("파일 삭제에 실패했습니다.");
			}
			
		} catch(Exception ie) {
			// printStackTrace 는 패키지정보, 클래스정보, 어떤 메소드에서 예외가 발생했는지까지
			// 모두 노출되기 때문에 로그파일 하나만 해킹당해도 정보들이 누출되기 때문에 보안상 현재는 사용하지 않는다.
//			ie.printStackTrace();
//			logger.info(ie.getMessage());
			System.out.println(ie.getMessage());
		}
		
	}

}
