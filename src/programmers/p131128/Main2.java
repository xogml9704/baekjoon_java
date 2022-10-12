package programmers.p131128;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // String X = "100";
        // String Y = "2345";
        
        //String X = "100";
        //String Y = "23400";
        
        String X = "100";
        String Y = "123450";
        
        String[] arrX = X.split("");
        String[] arrY = Y.split("");
        boolean Z = true;
        String answer = "";
        int[] arrInt = new int[10];
        for(int i=0; i<arrX.length; i++) {
            for(int j=0; j<arrY.length; j++) {
                if(arrX[i].equals(arrY[j])) {
                    Z = false;
                    arrInt[Integer.parseInt(arrY[j])]++;
                    arrY[j] = null;
                    break;
                }
            }
        }
        if(Z) {
            answer = "-1";
        } else {
            for(int i=9; i>=0; i--) {
                for(int j=0; j<arrInt[i]; j++) {
                    answer += i;
                }
            }
        }
        System.out.println(answer);
    }
}

