package baekjoon.b1316;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = Integer.parseInt(sc.nextLine());
	    int count = a;
	    for(int i=0; i<a; i++) {
	        String[] word = sc.nextLine().split("");
	        breakpoint :for(int j=0; j<word.length; j++) {
	            for(int k=j+1; k<word.length; k++) {
	                if(word[j].equals(word[k])) {
	                    if(!word[k].equals(word[k-1])) {
	                       count--;
	                       break breakpoint;
	                    }
	                }
	            }
	        }
	    }
	    System.out.println(count);
	}
}