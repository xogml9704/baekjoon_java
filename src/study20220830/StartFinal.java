package study20220830;

import java.util.Scanner;

public class StartFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		
		System.out.print("시작수 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("끝 수 : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("배 수 : ");
		int c = Integer.parseInt(sc.nextLine());
		while(true) {
			if(a <= (i*c) && (i*c) <= b) {
				sum += (i*c);
				i++;
				} else {
					break;
				}
			}
		System.out.println(sum);
		}
		
}
