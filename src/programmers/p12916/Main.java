package programmers.p12916;

public class Main {
	public static void main(String[] args) {
		String s = "Pyy";
		
		String[] arr = s.split("");
		int p_count = 0;
		int y_count = 0;
		boolean finish = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("p") || arr[i].equals("P")) {
				p_count++;
			} else if(arr[i].equals("y") || arr[i].equals("Y")) {
				y_count++;
			}
		}
		if(p_count != y_count) {
			finish = false;
		}
		System.out.println(finish);
	}
}
