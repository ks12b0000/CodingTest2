package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Num14681 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2) {
//		int answer = 0;
//		
////		if (num >= 1 && num2 >= 1) {		// 만약 num이 + num2가 +면 1 출력
////			answer = 1;
////		}
////		else if (num <= -1 && num2 >= 1) { 	// 만약 num이 - num2가 +면 2 출력
////			answer = 2;
////		}
////		else if (num <= -1 && num2 <= -1) {	// 만약 num이 - num2가 -면 3 출력
////			answer = 3;
////		}
////		else if (num >= 1 && num2 <= -1) {	// 만약 num이 + num2가 -면 4 출력
////			answer = 4;
////		}
//		
//		if (num > 0) {
//			if (num2 > 0) {
//				answer = 1;
//			}
//			else {
//				answer = 4;
//			}
//		}
//		else if (num2 > 0) {
//			answer = 2;
//		}
//		else {
//			answer = 3;
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num14681 T = new Num14681();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(T.solution(num, num2));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if (num >= 1 && num2 >= 1) {
//			answer = 1;
//		}
//		else if (num <= -1 && num2 >= 1) {
//			answer = 2;
//		}
//		else if (num <= -1 && num2 <= -1) {
//			answer = 3;
//		}
//		else if (num >= 1 && num2 <= -1) {
//			answer = 4;
//		}
//		
////		if (num > 0) {
////			if (num2 > 0) {
////				answer = 1;
////			}
////			else {
////				answer = 4;
////			}
////		}
////		else if (num2 > 0) {
////			answer = 2;
////		}
////		else {
////			answer = 3;
////		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		int num = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		if (num > 0) {
			if (num2 > 0) {
				answer = 1;
			}
			else {
				answer = 4;
			}
		}
		else if (num2 > 0) {
			answer = 2;
		}
		else {
			answer = 3;
		}
	
		System.out.println(answer);
		
		br.close();
	}

}
