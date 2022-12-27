package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Num1_2 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		
//		for (char x : str.toCharArray()) {			// str 문자들을 x에 담고 x가 소문자면 대문자로 변환
//			if (Character.isLowerCase(x)) {
//				answer += Character.toUpperCase(x);
//			}
//			else {
//				answer += Character.toLowerCase(x);		// str 문자들을 x에 담고 x가 대문자면 소문자로 변환
//			}
//		}
//		
//		return answer;
//	}
//	
//	public static void main(String [] args) {
//		Num1_2 T = new Num1_2();
//		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String answer = "";
//		
//		String str = sc.next();
//		
//		for (char x : str.toCharArray()) {
//			if (Character.isLowerCase(x)) {
//				answer += Character.toUpperCase(x);
//			} 
//			else {
//				answer += Character.toLowerCase(x);
//			}
//		}
//		System.out.println(answer);
//		
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "";
		
		String str = br.readLine();
		
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}
			else {
				answer += Character.toLowerCase(x);
			}
		}
		System.out.println(answer);
		
		br.close();
	}
}
