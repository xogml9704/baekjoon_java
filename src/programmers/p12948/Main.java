package programmers.p12948;

public class Main {
	public static void main(String[] args) {
		String phone_number = "01033334444";
        String[] number = phone_number.split("");
        String number2 = "";
		for(int i=0; i<number.length-4; i++) {
			number[i] = "*";
		}
        for(int i=0; i<number.length; i++) {
            number2 += number[i];
        }
        String answer = number2;
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]);
		}
	}
}
