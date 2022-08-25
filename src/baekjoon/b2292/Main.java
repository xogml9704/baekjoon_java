package baekjoon.b2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine()); // 받아 들이는 값
		int b = 1; // 초기 위치 값
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
