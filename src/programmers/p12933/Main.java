package programmers.p12933;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		long n = 118372;
		String a = "";
		long b = 0;
		String[] arr = String.valueOf(n).split("");
		String[] arr2 = new String[arr.length];
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			arr2[arr2.length-(i+1)] = arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			a += arr2[i];
		}
		b = Long.parseLong(a);
	}
}
