package chap07_class;

import chap07_class.student.Student;

public class _04_UseofStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("서준",25,"java");
		
		String[] strArr = new String[5];
		Student[] studentArr = new Student[5];
		
		studentArr[0]= new Student("김서준",25,"java");                            
		studentArr[1]= new Student("이서준",26,"java"); 
		studentArr[2]= new Student("한서준",27,"java"); 
		studentArr[3]= new Student("오서준",32,"java"); 
		studentArr[4]= new Student("유서준",39,"java"); 
		
		for(Student st : studentArr) {
			st.studentsInfo(); 
		}
		
		student.studentsInfo();
		

	}

}
