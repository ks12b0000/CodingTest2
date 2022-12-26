package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Num1_7 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		
//		str = str.toUpperCase();		// str을 대문자로 변환해주고
//
//		if (str.equals(new StringBuilder(str).reverse().toString())) {	// 만약 str값이 str을 뒤집은 값과 같으면 YES 출력
//			answer = "YES";
//		}
//		else {				// 아니면 NO 출력
//			answer = "NO";
//		}
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_7 T = new Num1_7();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";
//		String str = sc.next();
//		str = str.toUpperCase();
//		
//		if (str.equals(new StringBuilder(str).reverse().toString())) {
//			answer = "YES";
//		} 
//		else {
//			answer = "NO";
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		String str = br.readLine().toUpperCase();
		
		if (str.equals(new StringBuilder(str).reverse().toString())) {
			answer = "YES";
		}
		else {
			answer = "NO";
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
