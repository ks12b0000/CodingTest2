package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num0_9 {
	public int solution(int n, int t) {		// ex) n = 2, t = 5
        int answer = 0;
        
        for (int i = 0; i < t; i++) {		// t 만큼 반복, 0 ~ 4  5번 반복
        	answer = n * 2;					// answer = n * 2를 해주고,  2 * 2 = 4, 4 * 2 = 8, 8 * 2 = 16, 16 * 2 = 32, 32 * 2 = 64
        	n = answer;						// n = answer를 저장,  n = 4, n = 8, n = 16, n = 32, n = 64
        }
        
        return answer;						// answer = 64
    }
//	public static void main(String[] args) {
//		Num0_9 T = new Num0_9();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int t = sc.nextInt();
//		System.out.println(T.solution(n, t));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_9 T = new Num0_9();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		System.out.println(T.solution(n, t));
		br.close();
	}
}
