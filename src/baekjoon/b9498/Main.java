package baekjoon.b9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = Integer.parseInt(sc.nextLine());
		
		if(90 <=grade && grade <= 100) {
			System.out.println("A");
		} else if(80 <= grade && grade <= 89) {
			System.out.println("B");
		} else if(70 <= grade && grade <= 79) {
			System.out.println("C");
		} else if(60 <= grade && grade <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
