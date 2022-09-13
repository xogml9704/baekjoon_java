package programmers.p12928;

public class Main {
	public static void main(String[] args) {
		int n = 12;
		
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n%i == 0) {
				sum += i;
				sum += n/i;
			}
			System.out.println(i+" | "+sum);
		}
	}
}
