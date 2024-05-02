package chap11_abstraction;

import chap11_abstraction.tv.LgTv;
import chap11_abstraction.tv.SamsungTv;
import chap11_abstraction.tv.Tv;

public class _03_AbstractTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new SamsungTv();
		
		tv.powerOn();
		tv.operate(12);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		
		tv = new LgTv();
		
		tv.powerOn();
		tv.operate(25);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		

	}

}
