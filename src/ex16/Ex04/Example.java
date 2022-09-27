package ex16.Ex04;

public class Example {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					System.out.println("작업 스레드를 반복합니다.");
				}
			}
		};
		
		thread.start();
	}
}
