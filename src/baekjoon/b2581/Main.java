package baekjoon.b2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int min = 0;
        for(int i=m; i<=n; i++) {
            
        }
        if(sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}