package programmers.p12982;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,3};
        int budget = 6;
        
        Arrays.sort(d);
        int answer = 0;
        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            } else if(budget == 0) {
                answer++;
                break;
            }
            answer++;
        }
        
        System.out.println(answer);
        for(int i=0; i<d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
