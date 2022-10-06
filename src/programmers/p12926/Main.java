package programmers.p12926;

public class Main {
    public static void main(String[] args) {
        String s = "a B z Z";
        int n = 4;
        
        char[] arr = new char[s.length()];
        String answer = "";
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
            if('a' <= arr[i] && arr[i] <= 'z') {
                arr[i] += n;
                if(arr[i] > 'z') {
                    arr[i] -= 26;
                }
            } else if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] += n;
                if(arr[i] > 'Z') {
                    arr[i] -= 26;
                }
            }
            answer += arr[i];
        }
        System.out.println(answer);
    }
}
