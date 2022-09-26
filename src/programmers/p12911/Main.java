package programmers.p12911;

public class Main {
	public static void main(String[] args) {
		int n = 78; // result = 83
		// int n = 15; // result = 23
		for(int i=n; i<n+10; i++) {
			String two = "";
			int j = i;
			while(j>0) {
				two = j%2+two;
				j /= 2;
			}
			System.out.println(two);
		}
		
	}
}
