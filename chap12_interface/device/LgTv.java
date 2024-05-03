package chap12_interface.device;

public class LgTv implements Tv{

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 화면을 보여줍니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 화면을 킵니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 화면을 끕니다");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 소리를 킵니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("엘지티비: " + channel + "로 이동합니다.");
	}
	
//	@Override
//	public void reset() {
//		System.out.println("엘지티비 재부팅합니다.");
//	}

}
