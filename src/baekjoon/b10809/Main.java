package baekjoon.b10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split("");
		char[] arr2 = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i].charAt(0);
			if(arr2[i] > 'Z') {
				arr2[i] -= 32;
			}
		}
	}
}