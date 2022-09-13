package programmers.p12931;

public class Main {
	public static void main(String[] args) {
		int N = 987;
		int sum = 0;
		String[] arr = String.valueOf(N).split("");
		
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
		
		
	}
}
