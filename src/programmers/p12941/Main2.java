package programmers.p12941;

import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        
        Integer[] arrB = new Integer[B.length];
        for(int i=0; i<B.length; i++) {
            arrB[i] = B[i];
        }
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i=0; i<A.length; i++) {
            answer += A[i] * B[j];
            j--;
        }
    }
}
