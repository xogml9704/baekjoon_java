package baekjoon.b2739;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<10; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
	}
}
