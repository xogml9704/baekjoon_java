package ex05;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		int[] studentArray = null;
		int student = 0;
		int sum = 0;
		int max = 0;
		double avg = 0;
		
		while(exit) {
			System.out.println("---------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			String a = sc.nextLine();
			
			if(a.equals("1")) {
				
				System.out.print("학생수> ");
				student = Integer.parseInt(sc.nextLine());
				studentArray = new int[student];
			
			} else if(a.equals("2")) {
				
				for(int i=0; i<student; i++) {
					System.out.printf("scores[%d] : ", i);
					studentArray[i] = Integer.parseInt(sc.nextLine());
					}
				
			} else if(a.equals("3")) {
					
				for(int i=0; i<studentArray.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, studentArray[i]);
					}
			} else if(a.equals("4")) {
				
				for(int i=0; i<studentArray.length; i++) {
					if ( max < studentArray[i]) {
						max = studentArray[i];
						}
					}
				System.out.println("최고 점수 : " + max);
				
				for(int i=0; i<studentArray.length; i++) {
					sum += studentArray[i];
					}
				avg = (double) sum / student;
				System.out.println("평균 점수 : " + avg);
				
			} else if(a.equals("5")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
