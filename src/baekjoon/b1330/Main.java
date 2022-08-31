package baekjoon.b1330;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = sc.nextLine().split(" ");
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		
		if(b[0] > b[1]) {
			System.out.println(">");
		} else if(b[0] < b[1]) {
			System.out.println("<");
		} else if(b[0] == b[1]) {
			System.out.println("==");
		}
	}
}
