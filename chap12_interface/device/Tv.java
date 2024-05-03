package chap12_interface.device;

public interface Tv extends Display, Speaker {
	
	void changeChannel(int channel);

}
