package programmers;

public class One {
	public static void main(String[] args) {
		int n = 12;
		for(int i=1; i<n; i++) {
			if(n % i == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}
