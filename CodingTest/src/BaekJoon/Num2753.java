package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num2753 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num) {
//		int answer;
//		
//		if ((num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)) {			// 만약 num이 4의 배수인데,  num이 100의 배수가 아니거나 400의 배수일 때 1출력
//			answer = 1;
//		}
//		else {
//			answer = 0;
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2753 T = new Num2753();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(T.solution(num));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int answer;
//		
//		if ((num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)) {
//			answer = 1;
//		}
//		else {
//			answer = 0;
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int answer;
		
		if ((num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)) {
			answer = 1;
		}
		else {
			answer = 0;
		}
		
		System.out.println(answer);
		
		br.close();
	}
	
	
}
