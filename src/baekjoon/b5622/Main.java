package baekjoon.b5622;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dial = sc.nextLine();
		char[] arr2 = new char[dial.length()];
		int sum = 0;
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = dial.charAt(i);
			if(arr2[i] >= 'A' && arr2[i] <= 'C') {
				sum += 3;
			} else if(arr2[i] >= 'D' && arr2[i] <= 'F') {
				sum += 4;
			} else if(arr2[i] >= 'G' && arr2[i] <= 'I') {
				sum += 5;
			} else if(arr2[i] >= 'J' && arr2[i] <= 'L') {
				sum += 6;
			} else if(arr2[i] >= 'M' && arr2[i] <= 'O') {
				sum += 7;
			} else if(arr2[i] >= 'P' && arr2[i] <= 'S') {
				sum += 8;
			} else if(arr2[i] >= 'T' && arr2[i] <= 'V') {
				sum += 9;
			} else if(arr2[i] >= 'W' && arr2[i] <= 'Z') {
				sum += 10;
			}
		}
		System.out.println(sum);
		
	}
}