package baekjoon.b2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String[] arr = sc.nextLine().split("");
		
		int finish = 0;
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length-1) {
				finish++;
				break;
			} else {
				if(arr[i].equals("c")) {
					if(arr[i+1].equals("=") || arr[i+1].equals("-")) {
						i++;
					}
				} else if(arr[i].equals("d")) {
					if(arr[i+1].equals("-")) {
						i++;
					} else if(arr[i+1].equals("z")) {
						if(i+1 == arr.length-1) {
							
						} else {
							if(arr[i+2].equals("=")) {
								i += 2;
							}
						}
					}
				} else if(arr[i].equals("l")) {
					if(arr[i+1].equals("j")) {
						i++;
					}
				} else if(arr[i].equals("n")) {
					if(arr[i+1].equals("j")) {
						i++;
					}
				} else if(arr[i].equals("s") || arr[i].equals("z")) {
					if(arr[i+1].equals("=")) {
						i++;
					}
				}
			}
			finish++;
		}
		System.out.println(finish);
	}
}