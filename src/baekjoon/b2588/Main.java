package baekjoon.b2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String c[] = a.split("");
		String b = sc.nextLine();
		String d[] = b.split("");
		int e[] = new int[3];
		int f[] = new int[3];
		
		for(int i=0; i<c.length; i++) {
			e[i] = Integer.parseInt(c[i]);
			f[i] = Integer.parseInt(d[i]);
		}
		int g = (e[0]*100+e[1]*10+e[2]);
		System.out.println(g*f[2]);
		System.out.println(g*f[1]);
		System.out.println(g*f[0]);
		System.out.println((g*f[2])+(g*f[1]*10)+(g*f[0]*100));
		
	}
}
