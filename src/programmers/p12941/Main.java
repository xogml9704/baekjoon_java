package programmers.p12941;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length-1;
        for(int i=0; i<A.length; i++) {
            answer += A[i] * B[j];
            j--;
        }
    }
}
