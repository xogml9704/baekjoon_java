package project;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		int sum = 0;
		int m = 0;
		int plus = 0;
		
		String input = sc.nextLine();
		String b[] = input.split(",");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(b[i]);
			if(arr[i] % 2 == 1) {
				sum += arr[i];
				if(arr[i]<m) {
					m = arr[i];
				} else if (m==0) {
					m = arr[i];
				}
			}
		}
		if(sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(m);
		}
	}
}
