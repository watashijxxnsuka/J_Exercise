package chap11_abstraction.tv;

public class SamsungTv extends Tv {
	
	@Override
	public void powerOn() {
		System.out.println("OLED TV 전원을 켭니다");
	}
	
	@Override
	public void powerOff() {
		System.out.println("OLED TV 전원을 끕니다");
	}
	
	@Override
	public void operate(int channel) {
		this.lastChannel = channel;
		System.out.println("OLED " + this.lastChannel + "로 이동합니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("OLED " + ++this.lastChannel + "로 이동합니다.");
	}

	@Override
	public void channelDown() {
		System.out.println("OLED " + --this.lastChannel + "로 이동합니다.");
	}
}
