package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_5 {

	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer;
//		
//		char[] s = str.toCharArray();		// str문자열을 문자별로 s에 담고
//		int lt = 0, rt = str.length() -1;	
//		
//		while (lt < rt) {					// str 문자 0번째부터 마지막 문자 까지 검증
//			if (!Character.isAlphabetic(s[lt])) {	// 만약 문자s[lt번째]가 알파벳이 아니면 lt + 1 다음 문자로 이동
//				lt++;
//			}
//			else if(!Character.isAlphabetic(s[rt])) {	// 만약 문자 s[rt번째]가 알파벳이 아니면 rt - 1 이전 문자로 이동
//				rt--;
//			}
//			else {
//				char tmp = s[lt];			// 만약 알파벳이면 tmp에 s[lt번째]문자를 담아주고
//				s[lt] = s[rt];				// s[lt]번째 문자는 s[rt]번째 문자로 바꿔주고
//				s[rt] = tmp;				// s[rt]번째 문자는 tmp번째 문자로 바꿔주고 
//				lt++;						// lt + 1, rt - 1 해줌
//				rt--;
//			}
//		}
//		answer = String.valueOf(s);			// s를 String으로 변환해줘서 answer에 담아준다.
//		
//		return answer;
//	}
//	
//	public static void main (String [] args) {
//		Num1_5 T = new Num1_5();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer;
//		String str = sc.next();
//		char[] s = str.toCharArray();
//		int lt = 0, rt = str.length() -1;
//		
//		while (lt < rt) {
//			if (!Character.isAlphabetic(s[lt])) {
//				lt++;
//			}
//			else if (!Character.isAlphabetic(s[rt])) {
//				rt--;
//			}
//			else {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//		}
//		answer = String.valueOf(s);
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		String str = br.readLine();
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt])) {
				lt++;
			}
			else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			}
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		System.out.println(answer);
		
		
		br.close();
	}

}
