package baekjoon.b11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = 0;
		
		int a = Integer.parseInt(sc.nextLine());
		
		int[] b = new int[a];
		
		String c = sc.nextLine();
		String[] d = c.split("");
		
		for(int i=0; i<d.length; i++) {
			b[i] = Integer.parseInt(d[i]);
			e += b[i];
		}
		System.out.println(e);
		
		
	}
}
