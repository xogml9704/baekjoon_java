package programmers.p131128;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String X = "100";
        // String Y = "2345";
        
        String X = "100";
        String Y = "23400";
        
        // String X = "100";
        // String Y = "123450";
        
        String[] arrX = X.split("");
        String[] arrY = Y.split("");
        String Z = "";
        String answer = "";
        for(int i=0; i<arrX.length; i++) {
            for(int j=0; j<arrY.length; j++) {
                if(arrX[i].equals(arrY[j])) {
                    Z += arrX[i];
                    arrY[j] = null;
                    break;
                }
            }
        }
        if(Z.equals("")) {
            answer = "-1";
        } else {
            int[] arrZ = new int[Z.length()];
            for(int i=0; i<Z.length(); i++) {
                arrZ[i] = Integer.parseInt(Z.substring(i, i+1));
            }
            Arrays.sort(arrZ);
            if(arrZ[arrZ.length-1] == 0) {
                answer = "0";
            } else {
                for(int i=arrZ.length-1; i>=0; i--) {
                    answer += String.valueOf(arrZ[i]);
                }
            }
        }
        System.out.println(answer);
    }
}
