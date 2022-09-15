package baekjoon.b4673;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[10000];
		for(int i=1; i<10000; i++) {
			String[] arr2 = String.valueOf(i).split("");
			int sum = 0;
			for(int j=0; j<arr2.length; j++) {
				sum += Integer.parseInt(arr2[j]);
			}
			sum = sum + i;
			arr[i] = sum;
		}
		for(int i=1; i<10000; i++) {
			boolean b = true;
			for(int j=0; j<arr.length; j++) {
				if(i == arr[j]) {
					b = false;
					break;
				}
			}
			if(b) {
				System.out.println(i);
			}
			
		}
	}
}
