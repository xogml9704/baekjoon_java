package programmers.p131128;

public class Main2 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "23400";
        
        String[] arrX = X.split("");
        String[] arrY = Y.split("");
        int countX = 0;
        int countY = 0;
        for(int i=0; i<arrX.length; i++) {
            for(int j=0; j<10; j++) {
                if(arrX[i].equals(String.valueOf(j))) {
                    countX++;
                }
                System.out.println(countX);
            }
        }
    }
}
