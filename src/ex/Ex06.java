package ex;

public class Ex06 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("====================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("====================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("===================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int a=2; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int a=2; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int q=1; q<=i; q++) {
				System.out.print(" ");
			}
			for(int k=4; k>i; k--) {
				System.out.print("*");
			}
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("====================================");
		
		for(int i=5; i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(j==i) {
					for(int k=1;k<=5;k++) {
						if(k>=j) {
							System.out.print("*");
							}
						}
					}
				System.out.print(" ");
				}
			System.out.println("");   
			}
		
		System.out.println("====================================");
		
		
	}
}
