package programmers.p12919;

public class Main {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String a = "";
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				a = "김서방은" + (i) + "에 있다.";
 			}
		}
		System.out.println(a);
	}
}
