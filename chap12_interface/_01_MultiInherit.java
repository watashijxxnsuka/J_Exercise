package chap12_interface;

import chap12_interface.multiflex.ConcertHall;
import chap12_interface.multiflex.MultiFlexStadium;
import chap12_interface.multiflex.SeoulMultiFlexStadium;
import chap12_interface.multiflex.Stadium;
import chap12_interface.multiflex.Theater;

public class _01_MultiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SeoulMultiFlexStadium은 부모인터페이스로 MultiFlexStadium
		// 조부모 인터페이스로는 Stadium, ConcertHall을 상속받았기 때문에
		//부모와 조부모의 형태를 모두 가지고 있다.
		
		// 따라서 부모타입의 변수나 조부모타입의 변수에 객체를 담아서 사용할 수 있게 된다.
		Stadium st = new SeoulMultiFlexStadium();
		ConcertHall ch = new SeoulMultiFlexStadium();
		MultiFlexStadium mfs = new SeoulMultiFlexStadium();
		Theater theater = new SeoulMultiFlexStadium();
		SeoulMultiFlexStadium smfs = new SeoulMultiFlexStadium();
		
		
		
		
		
	}
	
	

}
