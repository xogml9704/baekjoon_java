package baekjoon.b2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<a; i++) {
			System.out.println(arr[i]);
		}
	}
}
