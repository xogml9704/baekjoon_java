package programmers;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int count = 0;
		
		for(int j=1; j<a; j++) {
			for(int i=2; i<100001; i++) {
				if(j%i == 0) {
					if(j == i) {
						System.out.println("그 수는 소수 입니다.");
						count++;
						break;
					}
				}
				
			}
			
		}
		System.out.println(count);
	}
}
