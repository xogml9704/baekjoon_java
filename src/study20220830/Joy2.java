package study20220830;

import java.util.Scanner;

public class Joy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char b = 0;
		String a1 = "abcdefghijklmnopqrstuvwxyz";
		char[] a2 = new char[a1.length()];
		for(int i=0; i<a1.length(); i++) {
			a2[i] = a1.charAt(i);
		}
		
		for(int i=0; i<a.length(); i++) {
			b = a.charAt(i);
			
			for(int j=0; j<a2.length; j++) {
				if(b == a2[j]) {
					if(b > 'v') {
						b -= 22;
						break;
					} else {
						b += 4;
						break;
					}
				}
			}
			System.out.print(b);
		}
	}
}