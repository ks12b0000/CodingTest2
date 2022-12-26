package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_6 {

	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		
//		for (int i = 0; i < str.length(); i++) {		// str에 길이만큼 검증 
//			if (str.indexOf(str.charAt(i)) == i) {		// str 문자열에서 처음으로 발견된 [i번째] 문자가 i번째랑 같으면
//				answer += str.charAt(i);				// answer에 i번째 str문자를 담아준다.
//			}
//		}
//		
//		return answer;
//	}
//	
//	public static void main (String [] args) {
//		Num1_6 T = new Num1_6();
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
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.indexOf(str.charAt(i)) == i) {
//				answer += str.charAt(i);
//			}
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main (String [] srgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
