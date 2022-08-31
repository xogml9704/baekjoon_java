package study20220830;

import java.util.Scanner;

public class Brain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String NorW = sc.nextLine();
		String[] NorW_arr = NorW.split(" ");
		int[] NorW_arr_int = new int[NorW_arr.length];
		int time = 0;
		int k = 0;
		int save_arr_position = 0;
		
		for(int i=0; i<NorW_arr.length; i++) {
			NorW_arr_int[i] = Integer.parseInt(NorW_arr[i]);
		}
		
		
		String[] save_arr = new String[NorW_arr_int[0]];
		String[] word_arr = new String[NorW_arr_int[1]];
		
		String input_word = sc.nextLine();
		word_arr = input_word.split(" ");
		
		for(int i=0; i<word_arr.length; i++) {
			boolean choice = false;
			int arr_position = 0;
			// 메모리가 다 차있느지 확인하는 부분
			for(int j=0; j<save_arr.length; j++) {
				if (save_arr[j] != null) {
					if (save_arr[j].equals(word_arr[i])) {
						choice = true;
						arr_position = j;
						break;	
					}
				}
			}
			// 중복되는 값이 들어올 때
			if(choice) {
				time ++;
				for(int j = arr_position; j<save_arr.length-1; j++) {
					save_arr[j] = save_arr[j+1];
				}
				save_arr[NorW_arr_int[0] - 1] = word_arr[i]; 
				// 중복되지 않은 값이 들어올 때
			} else {
				time += 3;
				if(save_arr[NorW_arr_int[0] - 1] != null) {
					int sum = 0;
					for (int j=0; j < save_arr.length; j++) {
						sum += save_arr[j].length();
					}
					int avg = sum / save_arr.length;
					for (int j=0; j < save_arr.length; j++) {
						if( save_arr[j].length() <= avg) {
							save_arr_position = j;
							break;
						}
					} for (int j = save_arr_position; j < save_arr.length; j++) {
						if (save_arr[j] != save_arr[NorW_arr_int[0] - 1]) {
							save_arr[j] = save_arr[j+1];
						} else {
							save_arr[j] = word_arr[i];
						}
					}
				}
				
				else {
					save_arr[k++] = word_arr[i];
				}
				
			}
			System.out.println(save_arr[0]);
			System.out.println(save_arr[1]);
			System.out.println(save_arr[2]);
			System.out.println(time);
		}
		System.out.println("걸린 시간을 초 단위로 출력");
		System.out.println(time);
	}
		
}
