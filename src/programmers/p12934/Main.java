package programmers.p12934;

public class Main {
	public static void main(String[] args) {
		int n = 121;
		int n_1 = n / 2;
		
		long a = 0;
		int i = 0;
		while (true) {
			if (i * i == n) {
				a = i+1;
				a = a * a;
				break;
			} else if(i * i > n_1) {
				a = -1;
			}
			i++;
		}
	}
}
