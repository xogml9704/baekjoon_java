package study20220831;

import java.util.Scanner;

public class Stairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] Stairs = sc.nextLine().split("");
		int count = 0;
		int total = 0;
		int slope = 1;
		boolean choice = false;
		
		for(int i=0; i<Stairs.length; i++) {
			if(Stairs[i].equals("(")) {
				count ++;
				total += count*slope;
			} else if(Stairs[i].equals(")")) { 
				total += count*slope;
				count --;
			} else if(Stairs[i].equals("#")) {
				if (choice == false) {
					slope = 2;
					choice = true;
				} else {
					slope = 1;
					choice = false;
				}
			}
		} 
		System.out.println("길용이가 소모하는 칼로리를 단위를 생략한 채 정수만 출력");
		System.out.println(total);
	}
}
