package baekjoon.b1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		String a = sc.nextLine();
		
		int[] arr = new int[2];
		
		if(Integer.parseInt(a)<10) {
			arr[0] = 0;
			arr[1] = Integer.parseInt(a);
		} else {
			String[] arr2 = new String[2];
			arr2 = a.split("");
			arr[0] = Integer.parseInt(arr2[0]);
			arr[1] = Integer.parseInt(arr2[1]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		int count = 0;
		
		while (run) {
			count++;
			int b = arr[0] + arr[1];
			String c = String.valueOf(arr[1]);
			String d = String.valueOf(b);
			
			if(b < 10) {
				
			}
		}
		System.out.println(count);
	}
}
