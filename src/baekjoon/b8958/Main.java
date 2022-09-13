package baekjoon.b8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int count = 0;
		int finish = 0;
		
		for(int i=0; i<a; i++) {
			String[] arr  = sc.nextLine().split("");
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("X")) {
					count = 0;
				} else {
					count ++;
				}
				finish += count;
			}
			System.out.println(finish);
			finish = 0;
			count = 0;
		}
	}
}
