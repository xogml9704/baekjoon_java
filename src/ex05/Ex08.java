package ex05;

public class Ex08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int m = 0;
		for(int i=0; i<array.length; i++) {
			m += array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		double avg = (double) sum / m;
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
