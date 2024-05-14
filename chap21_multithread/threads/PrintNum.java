package chap21_multithread.threads;

public class PrintNum {
	public static void printNum(int Num) {
		// Thread t1, t2
		// t1 1 ~ num 까지 출력
		// t2 num + 1 ~ num * 2 까지 출력
		// t1, t2 순서대로 대기큐에 등록
		// join 메소드로 t2가 먼저 실행되도록
		Thread thread = Thread.currentThread();
			System.out.println(thread.getName());
		
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				int num = Num;
				for(int i = 1; i < num; i++) {
					System.out.println(i);
				}
			}
		};
		Thread t2 = new Thread() { 
			@Override 
			public void run() {
				int num = Num;
				for(int i = num; i < num * 2 ; i++) {
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	public static void main(String[] args) {
		
		PrintNum.printNum(30);
		
	}
	
}
