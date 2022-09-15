package programmers.p12912;

public class Main {
	public static void main(String[] args) {
		int a = -12;
		int b = 1;
		long result = 0;
		if(a<b) {
			for(int i = a; i<=b; i++) {
				result += i;
			}
		} else if(a==b) {
			result = a;
		} else {
			for(int i=b; i<=a; i++) {
				result += i;
			}
		}
		System.out.println(result);
		
		
		
	}
}
