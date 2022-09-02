package baekjoon.b25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = Integer.parseInt(sc.nextLine());
		int thing = Integer.parseInt(sc.nextLine());
		int[] b = new int[2];
		int sum = 0;
		
		for(int i=0; i<thing; i++) {
			String[] a = sc.nextLine().split(" ");
			for (int j=0; j<a.length; j++) {
				b[j] = Integer.parseInt(a[j]);
			}
			sum += b[0] * b[1];
		}
		if(total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
