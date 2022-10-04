package programmers.p12903;

public class Main {
    public static void main(String[] args) {
        // String s = "abcde";
        String s = "qwer";
        
        int a = 0;
        String answer = "";
        if(s.length()%2 == 0) {
            a = s.length()/2 - 1;
            answer += String.valueOf(s.charAt(a));
            answer += String.valueOf(s.charAt(a+1));
        } else {
            a = s.length() / 2;
            answer += String.valueOf(s.charAt(a));
        }
        
        // String answer = String.valueOf(s.charAt(a));
        
        // System.out.println(answer);
    }
}
