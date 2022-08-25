package ex05;

public class Ex07 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int a = 0;
		
		for(int i=0; i<array.length; i++) {
			if ( a < array[i]) {
				a = array[i];
			}
		}
		System.out.println(a);
	}

}
