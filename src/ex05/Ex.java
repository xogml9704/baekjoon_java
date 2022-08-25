package ex05;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// String a = sc.nextLine();
		// System.out.println(a);
		int[] b = new int[5];
		
		for(int i=0; i<b.length; i++) {
			System.out.print("값을 입력하세요 : ");
			b[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i=0; i<b.length; i++) {
			System.out.printf("b[%d]의 값은 : %d\n", i, b[i]);
		}
		
		String[][] c = new String[2][3];
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print("값을 입력하세요 : ");
				c[i][j] = sc.nextLine();
			}
			
		}
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("[%d][%d] 의 값은 : %s\n", i, j, c[i][j]);
			}
		}
	}
}
