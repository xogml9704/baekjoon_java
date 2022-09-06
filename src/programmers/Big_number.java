package programmers;

public class Big_number {
	public static void main(String[] args) {
		// int[] numbers = {6, 10, 2};
		int[] numbers = {3, 30, 34, 5, 9};
		
		String[] arr = new String[numbers.length];
		String tmp;
		
		for(int i=0; i<numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(arr[i].charAt(0) < arr[j].charAt(0)) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else if (arr[i].charAt(0)== arr[j].charAt(0)) {
					
				}
			}
		}
		
	}
}
