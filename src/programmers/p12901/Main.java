package programmers.p12901;

public class Main {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int sum = 0;
		for(int i=1; i<a; i++) {
			if(i == 2) {
				sum += 29;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			} else {
				sum += 31;
			}
		}
		sum += b;
		sum = sum%7;
		String result = "";
		if(sum == 0) {
			result = "THU";
		} else if (sum == 1) {
			result = "FRI";
		} else if (sum == 2) {
			result = "SAT";
		} else if (sum == 3) {
			result = "SUN";
		} else if (sum == 4) {
			result = "MON";
		} else if (sum == 5) {
			result = "TUE";
		} else if (sum == 6) {
			result = "WED";
		}
		System.out.println(result);
	}
}
