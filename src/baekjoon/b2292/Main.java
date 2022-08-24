package baekjoon.b2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int b = 1;
		for(int i = 0; true;) {
			b = b + (6*i);
			i++;
			if(b>=a) {
				System.out.println(i);
			break;
			}
		}
	}
}
