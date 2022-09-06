package programmers;

public class LeftRight {
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int count = 0;
		int sum = 0;
		
		for(int i=left; i<=right; i++) {
			count = 0;
			for(int j=1; j<=i; j++) {
				if( i % j == 0) {
					count ++;
				}
			}
			System.out.println(count);
			if(count % 2 == 0) {
				sum += i;
			} else if(count % 2 == 1) {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
