package programmers;

import java.util.Arrays;

public class Darts {
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		
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
		
		boolean[] boo = new boolean[result.length];
		int count = 0;
		
		
		for(int i=0; i<result.length; i++) {
			for(int j=i+1; j<result.length; j++) {
				if(result[i] == result[j]) {
					boo[j] = true;
				}
			}
			if(boo[i] == true) {
				count++;
			}
		}
		
		int[] arr = new int[result.length-count];
		int number = 0;
		
		for(int i=0; i<boo.length; i++) {
			if(boo[i] == false) {
				arr[number] = result[i];
				number++;
			}
		}
		
		/*
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		*/
		
	}
}
