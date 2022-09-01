package baekjoon.b2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] AorB = sc.nextLine().split(" ");
		int[] time = new int[AorB.length];
		int plusTime = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<AorB.length; i++) {
			time[i] = Integer.parseInt(AorB[i]);
		}
		
		time[1] += plusTime;
		
		int plusA = time[1] / 60;
		
		time[1] %= 60;
		
		time[0] += plusA;
		
		if(time[0] >= 24) {
			time[0] %= 24;
		}
		
		System.out.println(time[0]+" "+time[1]);
		
		
	}
}
