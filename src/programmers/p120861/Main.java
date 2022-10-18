package programmers.p120861;

public class Main {
    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {11, 11};
        
        int[] answer = {0, 0};
        int width = board[1] / 2;
        int height = board[0] / 2;
        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("up")) {
                if(answer[1] != width) {
                    answer[1]++;
                }
            } else if(keyinput[i].equals("down")) {
                if(answer[1] != (width*-1)) {
                    answer[1]--;
                } 
            } else if(keyinput[i].equals("right")) {
                if(answer[0] != height) {
                    answer[0]++;
                }
            } else {
                if(answer[0] != (height*-1)) {
                    answer[0]--;
                }
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}