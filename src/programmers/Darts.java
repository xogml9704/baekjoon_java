package programmers;

import java.util.Arrays;

public class Darts {
	public static void main(String[] args) {
		int[] numbers = {0, 0, 100, 100};
		
		int numbers_length = 0;
		
		for(int i=0; i<numbers.length; i++) {
			numbers_length += i;
		}
		
		int[] result = new int[numbers_length];
		
		int k = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				result[k] = numbers[i] + numbers[j];
				k++;
			}
		}
		
		Arrays.sort(result);
		
		int count = 0;
		
		for(int i=0; i<result.length; i++) {
			if(result[i] == 0) {
				count++;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=i+1; j<result.length; j++) {
				if(result[i] == result[j] && result[i] != 0) {
					count++;
					result[j] = 0;
				}
			}
			System.out.println(result[i]+" ,"+count);
		}
		int sum = result.length - count;
		int[] arr = new int[sum];
		
		int arr_result =0;
		for(int i=0; i<result.length; i++) {
			if(result[i] != 0) {
				arr[arr_result] = result[i];
				arr_result++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
