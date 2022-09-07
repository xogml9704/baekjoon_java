package baekjoon.b10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	// 1 1  2
    	// 2 3  5
    	// 3 4  7
    	// 9 8  17
    	// 5 2  7
    	// 0 0  종료
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st; // 문자열을 잘라서 넣어줌
    	
    	while(true) {
    		st = new StringTokenizer(br.readLine());
    		bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
    		System.out.println(br.read());
    	}
    	// bw.close();
    }
}
