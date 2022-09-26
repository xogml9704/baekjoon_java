package programmers.p12922;

public class Main {
	public static void main(String[] args) {
		int n = 4;
		// int n = 4;
		boolean a = true;
		String b = "";
		for(int i=0; i<n; i++) {
			if(a) {
				b += "수";
				a = false;
			} else {
				b += "박";
				a = true;
			}
		}
		System.out.println(b);
	}
}
