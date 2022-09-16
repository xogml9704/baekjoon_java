package baekjoon.b10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] arr = new char[a.length()];
		
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(i);
		}
		int[] arr2 = new int[26];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = -1;
		}
		for(char i = 'a'; i<='z'; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == arr[j]) {
					arr2[i-97] = (int) j;
					break;
				}
			}
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}