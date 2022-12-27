package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Num1_8 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		str = str.toUpperCase().replaceAll("[^A-Z]", "");		// str을 대문자로 바꿔주고 A-Z까지의 알파벳이 아니면 지워줌.
//		String tmp = new StringBuilder(str).reverse().toString();	// str을 뒤집어줌
//		
//		if (str.equals(tmp)) {			// str값이랑 str뒤집은 값이 같은지.
//			answer = "YES";
//		}
//		else {
//			answer = "NO";
//		}
//			
//		return answer;
//	}
//	
//	public static void main (String [] args ) {
//		Num1_8 T = new Num1_8();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "NO";
//		String str = sc.nextLine();
//		str = str.toUpperCase().replaceAll("[^A-Z]", "");
//		String tmp = new StringBuilder(str).reverse().toString();
//		if (str.equals(tmp)) {
//			answer = "YES";
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
//	public static void main (String [] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String answer = "NO";
//		
//		String str = br.readLine();
//		str = str.toUpperCase().replaceAll("[^A-Z]", "");
//		String tmp = new StringBuilder(str).reverse().toString();
//		
//		if (str.equals(tmp)) {
//			answer = "YES";
//		}
//		
//		System.out.println(answer);
//		
//		br.close();
//	}
	
	
	
	/* 백준 방식3 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "NO";
		
		String str = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
		
		if (str.equals(new StringBuilder(str).reverse().toString())) {
			answer = "YES";
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
