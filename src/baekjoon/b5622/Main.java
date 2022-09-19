package baekjoon.b5622;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.nextLine();
		char[] arr = new char[dial.length()];
		for(int i=0; i<dial.length(); i++) {
			arr[i] = dial.charAt(i);
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			if(arr[i] <= 'Z') {
				for(char j='A'; j<='Z'; j++) {
					if(arr[i] == j && arr[i] < 'W') {
						int a  = j - 'A';
						count = (a / 3) + 3;
						break;
					} else if (arr[i] == j && arr[i] >= 'W' && arr[i] <= 'Z') {
						count = 10;
						break;
					}
				}
				
			}
			sum += count;
 		}
		System.out.println(sum);
	}
}