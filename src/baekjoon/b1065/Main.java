package baekjoon.b1065;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int count = 0;
		
		for(int i=1; i<=a; i++) {
			if(i > 99) {
				String[] arr = String.valueOf(i).split("");
				int b = Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
				int c = Integer.parseInt(arr[2])-Integer.parseInt(arr[1]);
				if(b == c) {
					count++;
				}
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}