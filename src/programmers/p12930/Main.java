package programmers.p12930;

public class Main {
	public static void main(String[] args) {
		String s = "try hello  world";
		
		int count = 0;
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if (a >= 'A' && a <= 'Z') {
				a -= 'A' - 'a';
			}
			if(a == ' ') {
				count = 0;
			} else {
				if(count%2 == 0) {
					if( a>= 'a' && a <= 'z') {
						a += 'A' - 'a';
					}
				}
				count++;
			}
			System.out.print(count + ", ");
			answer += a;
		}
		System.out.println();
		System.out.println(answer);
	}
}
