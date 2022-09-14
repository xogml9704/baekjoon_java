package programmers.p12932;

public class Main {
	public static void main(String[] args) {
		long n = 12345;
		
		String[] arr = String.valueOf(n).split("");
		int[] arr2 = new int[arr.length];
		int j = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			arr2[j] = Integer.parseInt(arr[i]);
			j++;
		}
	}
}
