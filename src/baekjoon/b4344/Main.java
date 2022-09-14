package baekjoon.b4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		long finish = 0;
		
		for(int i=0; i<a; i++) {
			String[] arr = sc.nextLine().split(" ");
			long[] arr2 = new long[arr.length];
			for(int j=0; j<arr.length; j++) {
				arr2[j] = Integer.parseInt(arr[j]);
			}
			for(int j=1; j<arr2.length; j++) {
				finish += (long) arr2[j];
				System.out.println(finish);
			}
			finish = finish / arr2[0];
		}
		System.out.println(finish);
	}
}
