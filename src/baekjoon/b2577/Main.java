package baekjoon.b2577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		String[] arr = String.valueOf(a * b * c).split("");
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<arr2.length; j++) {
				if(i == arr2[j]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}