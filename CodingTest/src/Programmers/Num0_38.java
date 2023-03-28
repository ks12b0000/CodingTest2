package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num0_38 {
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
        	answer++;
        	while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
        		answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) throws IOException {
		Num0_38 T = new Num0_38();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(T.solution(n));
		
		br.close();
		
	}
}
