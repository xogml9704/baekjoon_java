package programmers.p12954;

public class Main {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long sum = 0;
		long[] finish = new long[n];
		for(int i=0; i<n; i++) {
			 sum += x;
			 finish[i] = sum;
		}
	}
}
