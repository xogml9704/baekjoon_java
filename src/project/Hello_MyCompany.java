package project;

import java.util.Scanner;

public class Hello_MyCompany {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Hello = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < Hello; i++) {
			System.out.println("Hello MyCompany!");
		}
		
	}
}
