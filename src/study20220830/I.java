package study20220830;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple = 0;
		String apple_score = null;
		String container1 = null;
		String container2 = null;
		int sum = 0;
	
		apple = Integer.parseInt(sc.nextLine());
		String[] apple_score_arr = new String[apple];
		String[] container1_arr = new String[apple];
		String[] container2_arr = new String[apple];
		
		apple_score = sc.nextLine();
		apple_score_arr = apple_score.split(" ");
		
		container1 = sc.nextLine();
		container1_arr = container1.split("");
		
		container2 = sc.nextLine();
		container2_arr = container2.split("");
		
		for(int i=0; i<apple; i++) {
			if(container1_arr[i].equals("O") && container2_arr[i].equals("O")) {
				sum += Integer.parseInt(apple_score_arr[i]);
			}
		}
		System.out.println(sum);
	}
}