package baekjoon.b1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		int cross = 1;
		int sum = 0;
		
		while(true) {
			if(a <= sum + cross) {
				if (cross % 2 == 1) {
					System.out.println((cross - (a - sum -1)) + "/" + (a - sum));
					break;
				} else {
					System.out.println((a - sum) + "/" + (cross - (a - sum -1)));
					break;
				}
			} else {
				sum += cross;
				cross++;
			}
		}
	}
}