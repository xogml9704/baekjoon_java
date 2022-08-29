package baekjoon.b10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b[] = a.split(" ");
		int c[] = new int[3];
		
		for(int i=0; i<b.length; i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		int A = c[0];
		int B = c[1];
		int C = c[2];
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}
