package baekjoon.b4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<a; i++) {
			int count = 0;
			double result = 0;
			long finish = 0;
			String[] arr = sc.nextLine().split(" ");
			long[] arr2 = new long[arr.length];
			for(int j=0; j<arr.length; j++) {
				arr2[j] = Integer.parseInt(arr[j]);
			}
			for(int j=1; j<arr2.length; j++) {
				finish += (long) arr2[j];
			}
			finish = finish / arr2[0];
			for(int j=1; j<arr2.length; j++) {
				if(arr2[j] > finish) {
					count++;
				}
			}
			result = (double) count*100 / arr2[0];
			result = Math.round(result * 1000) / 1000;
			System.out.println(result+"%");
		}
	}
}
