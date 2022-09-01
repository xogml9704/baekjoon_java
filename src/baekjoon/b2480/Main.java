package baekjoon.b2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] dice = sc.nextLine().split(" ");
		int count = 0;
		int max = 0;
		int[] dice_arr = new int[dice.length];
		
		
		for(int i=0; i<dice.length; i++) {
			dice_arr[i] = Integer.parseInt(dice[i]);
		}
		
		if(dice_arr[0] == dice_arr[1]) {
			count++;
			if(dice_arr[0] == dice_arr[2]) {
				count++;
			}
		} else if(dice_arr[0] == dice_arr[2]) {
			count++;
		} else if(dice_arr[1] == dice_arr[2]) {
			count++;
		}
		
		
		if(count == 0) {
			max = dice_arr[0];
			for(int i=0; i<dice.length - 1; i++) {
				if(max < dice_arr[i+1]) {
					max = dice_arr[i+1];
				}
			}
			max *= 100;
		} else if (count == 1) {
			if(dice_arr[0] == dice_arr[1]) {
				max = dice_arr[0];
			} else if(dice_arr[0] == dice_arr[2]) {
				max = dice_arr[0];
			} else if(dice_arr[1] == dice_arr[2]) {
				max = dice_arr[1];
			}
			max = 1000 + (max * 100);
			
		} else if (count == 2) {
			max = dice_arr[0];
			max = 10000 + (max * 1000);
		}
		System.out.println(max);
	}
}
