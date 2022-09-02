package baekjoon.b10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		int[] b = new int[2];
		String[] a = new String[2];
		int[] c = new int[t];
		
		for(int i=0; i<t; i++) {
			a = sc.nextLine().split(" ");
			for(int j = 0; j<a.length; j++) {
				b[j] = Integer.parseInt(a[j]);
			}
			c[i] = b[0] + b[1];
			}
		for(int i=0; i<t; i++) {
			System.out.println(c[i]);
		}
	}
}
