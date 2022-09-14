package programmers.p12943;

public class Main {
	public static void main(String[] args) {
		int num = 16;
		int count = 0;
		for(int i=0; i<500; i++) {
			if(num % 2 == 0) {
				num = num / 2;
			} else if (num % 2 == 1) {
				num = num*3+1;
			}
			count++;
			if(num == 1) {
				break;
			}
		}
		if(num != 1) {
			num = -1;
		}
		System.out.println(count);
	}
}
