package study20220830;

import java.util.Scanner;

public class Joy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b[] = a.split("");
		
		for(int i=0; i<b.length; i++) {
			for(int j = (int) 'a';j <= (int) 'z'; j++) {
				char d = (char) j;
				String e = String.valueOf(d);
				if(b[i].equals(e)) {
					if((int) 'v' < d) {
						d -= 22;
						b[i] = String.valueOf(d);
						break;
					} else {
						d += 4;
						b[i] = String.valueOf(d);
						break;
					}
				}
				
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
