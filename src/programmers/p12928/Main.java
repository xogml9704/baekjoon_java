package programmers.p12928;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sum += i;
				sum += n/i;
			}
		}
		sum = sum / 2;
	}
}
