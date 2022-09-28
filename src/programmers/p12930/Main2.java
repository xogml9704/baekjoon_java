package programmers.p12930;

public class Main2 {
	public static void main(String[] args) {
		String s = "try hello world";
		
		
		int count = 0;
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if(a >= 'A' && a <= 'Z') {
				a -= 'A' - 'a';
			}
			if(count%2 == 0) {
				if ( a>= 'a' && a <= 'z') {
					a += 'A' - 'a';
				}
			}
			answer += a;
			count++;
		}
		System.out.println(answer);
	}

}
