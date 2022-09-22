package baekjoon.b2869;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		int sum = 0;
		int count = 0;
		for(int i = count; count<=sum;) {
			count++;
			if(sum+Integer.parseInt(arr[0]) >= Integer.parseInt(arr[2])) {
				break;
			} else {
				sum += Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
			}
		}
		System.out.println(count);
	}
}