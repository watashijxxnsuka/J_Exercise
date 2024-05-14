package chap21_multithread;

import chap21_multithread.threads.InterruptedThread;

public class _11_SafeExitInterrupt {
	public static void main(String[] args) {
		InterruptedThread it = new InterruptedThread();
		
		it.start();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// InterrupetedThread 스레드에 InterruptedException 발생시켜
		// 스레드 안정종료
		it.interrupt();
		
		
	}
	
	

}
