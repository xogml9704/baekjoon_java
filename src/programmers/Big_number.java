package programmers;

public class Big_number {
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		// int[] numbers = {3, 30, 34, 5, 9};
		String arr[] = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		String[][] a = new String[numbers.length][2];
		for(int i=0; i<arr.length; i++) {
			a[i] = arr[i].split("");
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i][0] < a[i+1][0]) {
				
			}
		}
		
	}
}
