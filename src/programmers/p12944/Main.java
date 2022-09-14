package programmers.p12944;

public class Main {
	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 4};
		int[] arr = {5, 5};
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			}
		sum = sum / arr.length;
		System.out.println(sum);
	}
}
