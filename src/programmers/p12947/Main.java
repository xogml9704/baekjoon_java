package programmers.p12947;

public class Main {
	public static void main(String[] args) {
		// int x = 10;
		// int x = 12;
		 int x = 11;
		// int x = 13;
		String[] arr = String.valueOf(x).split("");
		int sum = 0;
		boolean a = true;
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		if( x % sum != 0) {
			a = false;
		}
		System.out.println(a);
	}
}
