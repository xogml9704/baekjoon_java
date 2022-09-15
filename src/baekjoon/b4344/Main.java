package baekjoon.b4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<a; i++) {
			String[] arr = sc.nextLine().split(" ");
			int[] arr2 = new int[arr.length];
			for(int j=0; j<arr.length; j++) {
				arr2[j] = Integer.parseInt(arr[j]);
			}
			int sum = 0;
			for(int j=1; j<arr2.length; j++) {
				sum += arr2[j];
			}
			sum = sum / arr2[0];
			int count = 0;
			for(int j=1; j<arr2.length; j++) {
				if(arr2[j] > sum) {
					count++;
				}
			}
			double result = (double) count / arr2[0];
			System.out.println(String.format("%.3f", result * 100)+"%");
		}
	}
}
