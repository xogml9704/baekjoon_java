package baekjoon.b2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] watch = sc.nextLine().split(" ");
		
		int[] watch_arr = new int[watch.length];
		int sum = 0;
		
		for(int i=0; i<watch.length; i++) {
			watch_arr[i]= Integer.parseInt(watch[i]);
		}
		
		int a = watch_arr[0] * 60;
	
		sum = a + watch_arr[1];
		
		sum -= 45;
		
		int H = sum / 60;
		
		int M = sum % 60;
		
		
		if(M < 0) {
			M += 60;
			if(H == 0) {
				H = 23;
			}
		}
		
		System.out.println(H + " " + M);
	}
}
