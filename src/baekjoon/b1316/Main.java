package baekjoon.b1316;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<a; i++) {
			String word = sc.nextLine();
			char[] arr = new char[word.length()];
			for(int j=0; j<word.length(); j++) {
				arr[j] = word.charAt(j);
			}
			
			
		}
	}
}
