package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num8393 {
	
	/* 프로그래머스 방식 */
	public int solution(int num) {
		int answer = 0;
		
		for (int i = 1; i <= num; i++) {
			answer += i;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num8393 T = new Num8393();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(T.solution(num));
		sc.close();
	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int answer = 0;
//		
//		for (int i = 1; i <= num; i++) {
//			answer += i;
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
//		int answer = 0;
//		
//		for (int i = 1; i <= num; i++) {
//			answer += i;
//		}
//		
//		System.out.println(answer);
//		
//		br.close();
//	}

}
