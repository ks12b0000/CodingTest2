package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num0_10 {
	public int solution(int n) {		// ex) n = 144
        int answer = 0;
        double num = Math.sqrt(n);		// Math.sqrt를 이용해서 n의 제곱수를 구해줌.   num = 12.0
        
        if (num % 1 == 0) {				// num % 1 이 0이면 answer 1출력 (제곱수가 맞으면 % 1 하면 0이 나옴)  12.0 % 1 = 0
        	answer = 1;
        }
        else {
        	answer = 2;					// 아니면 answer 2출력 
        }
        
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_10 T = new Num0_10();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println(T.solution(n));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_10 T = new Num0_10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(T.solution(n));
		br.close();
	}
}
