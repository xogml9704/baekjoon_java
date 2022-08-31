package baekjoon.b14681;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		
		if (0 < x && 0 < y) {
			System.out.println(1);
		} else if (x < 0 && 0 < y) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else if (0 < x && y < 0) {
			System.out.println(4);
		}
	}
}
