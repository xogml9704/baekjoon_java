package baekjoon.b10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[2];
        int[] c = 
        int j = 0;

        while(true) {
        	String[] a = sc.nextLine().split(" ");
        	if(a[0].equals("0") && a[1].equals("0")) {
        		break;
        	} else {
        		for(int i=0; i<a.length; i++) {
        			b[i] = Integer.parseInt(a[i]);
        		}
        		c[j] = b[0] + b[1];
        		j++;
        	}
        }
        
        for(int i=0; i<c.length; i++) {
        	System.out.println(c[j]);
        }
    }
}
