package programmers.p12906;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		String a = "";
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				a += arr[i];
			}
		}
		a += arr[arr.length-1];
		String[] arr2 = a.split("");
		int[] finish = new int[arr2.length];
		for(int i=0; i<finish.length; i++) {
			finish[i] = Integer.parseInt(arr2[i]);
		}
		
	}
}
