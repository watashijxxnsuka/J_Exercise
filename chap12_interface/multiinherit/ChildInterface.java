package chap12_interface.multiinherit;

public class ChildInterface implements MotherInterface, FatherInterface {

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("잘 고친다.");
	}

	@Override
	public void calm() {
		// TODO Auto-generated method stub
		System.out.println("침착하다.");
	}

}
