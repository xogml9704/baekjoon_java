package programmers.p12935;

public class Main {
	public static void main(String[] args) {
		int[] arr = {10};
		if(arr.length == 1) {
			int[] arr_final = {-1};
			// return arr_final;
		} else {
			int tmp = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(tmp > arr[i]) {
					tmp = arr[i];
				}
			}
			String a = "";
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != tmp) {
					a += arr[i];
				}
			}
			String[] arr2 = a.split("");
			int[] arr_final = new int[arr2.length];
			for(int i=0; i<arr2.length; i++) {
				arr_final[i] = Integer.parseInt(arr2[i]);
			}
			// return arr_final;
		}
	}
}
