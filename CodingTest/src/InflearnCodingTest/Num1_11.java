package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_11 {
	
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		str = str + " ";				// str뒤에 빈 문자를 추가해줘야 됨. 이유는 밑에 if (str.charAt(i) == str.charAt(i + 1))
//		int num = 1;					// 이 부분이 마지막에 빈 문자를 추가안해주면 i+1을 해서 검증을 할 수 없기 때문!
//		
//		for (int i = 0; i < str.length() - 1; i++) {	// 마지막 빈 문자까지 검증하면 안되기 때문에 str 길이의 -1까지만 검증
//			if (str.charAt(i) == str.charAt(i + 1)) {	// 만약 str i번째 문자랑 str i + 1 문자랑 같으면 num 1 증가
//				num++;
//			}
//			else {										// 다르면 answer 에 str i번째 문자 담아주고 
//				answer += str.charAt(i);
//				if (num > 1) {							// 만약 num이 1보다 크면 answer에 num값을 String으로 변환해서 넣어줌
//					answer += String.valueOf(num);
//				}
//				num = 1;								// num이 1보다 크지 않으면 그냥 1을 담음.
//			}
//		}
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_11 T = new Num1_11();
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
//		str = str + " ";
//		int num = 1;
//		
//		for (int i = 0; i < str.length() - 1; i++) {
//			if (str.charAt(i) == str.charAt(i + 1)) {
//				num++;
//			}
//			else {
//				answer += str.charAt(i);
//				if (num > 1) {
//					answer += String.valueOf(num);
//				}
//				num = 1;
//			}
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
		String str = br.readLine() + " ";
		int num = 1;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				num++;
			}
			else {
				answer += str.charAt(i);
				if (num > 1) {
					answer += String.valueOf(num);
				}
				num = 1;
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
