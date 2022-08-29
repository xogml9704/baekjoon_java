package baekjoon.b3003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arry[] = null;
		int arry2[] = new int[6];
		int chess[] = {1, 1, 2, 2, 2, 8};
		String a = sc.nextLine();
		
		arry = a.split(" ");
		for(int i=0; i<arry.length; i++) {
			arry2[i] = Integer.parseInt(arry[i]);
			
		}
		for(int i=0; i<chess.length; i++) {
				int b = chess[i]-arry2[i];
				System.out.print(b+" ");
			
		}
	}
}
