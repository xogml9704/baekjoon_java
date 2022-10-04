package ex18.Ex10;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            
            // 경로 입력
            System.out.println("원본 파일 경로 : ");
            String a = sc.nextLine();
            
            System.out.println("복사 파일 경로 : ");
            String b = sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
