package baekjoon.b8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		int sum = 0;
		
		for(int i=0; i<b; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
	}
}
