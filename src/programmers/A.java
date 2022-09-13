package programmers;

public class A {
	public static void main(String[] args) {
		int n = 5;
		int arr1 = 9;
		String b = "";
		
		for(int i=n; i>0; i--) {
			int a = 1;
			for(int j=0; j<i-1; j++) {
				a *= 2;
			}
			if(arr1 - a >= 0) {
				arr1 -= a;
				b += 1;
			} else {
				b += 0;
			}
		}
		System.out.println(b);
	}
}
