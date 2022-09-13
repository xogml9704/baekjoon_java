package programmers.p12934;

public class Main {
	public static void main(String[] args) {
		long n = 121;
		long a = 0;
		
		for(long i=0; i<=n; i++) {
			if(i * i == n) {
				a = i+1;
				a = a * a;
				break;
			} else {
				a = -1;
			}
		}
		System.out.println(a);
	}
}
