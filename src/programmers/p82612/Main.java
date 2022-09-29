package programmers.p82612;

public class Main {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
        long sum = 0;
		for(int i=1; i<=count; i++) {
			sum += (price * i);
		}
		sum = sum - money;
		if( sum < 0) {
			sum = 0;
		}
		System.out.println(sum);
	}
}
