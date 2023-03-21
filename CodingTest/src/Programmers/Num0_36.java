package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num0_36 {
	public int solution(int a, int b) {
        int answer = 0;
       
        int newb = b / gcd(a, b);
        
        while (newb != 1) {
        	if (newb % 2 == 0) newb = newb / 2;
        	else if (newb % 5 == 0) newb = newb / 5;
        	else return 2;
        	return 1;
        }
        
        return answer;
    }
	private int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a % b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Num0_36 T = new Num0_36();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(T.solution(a, b));		
		
		br.close();
	}
}
