package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_12 {
	
	
	
	/* 프로그래머스 방식 */
//	public String solution(int n, String str) {
//		String answer = "";
//		
//		for (int i = 0; i < n; i++) {			// 입력한 n 만큼 검증
//			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');	// str을 0번 ~ 7번째 문자까지 끊어주고 #은 1로 *는 0으로 바꿔줌 
//			int num = Integer.parseInt(tmp, 2);		// int num에 tmp를 2진수로 넘긴다 
//			answer += (char) num;					// answer에 num을 char형태로 바꿔서 저장.
//			str = str.substring(7);					// 0~7번째 문자까지 검증 했으므로 7번째 문자까지 없애줌.
//		}
//		
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_12 T = new Num1_12();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String str = sc.next();
//		System.out.println(T.solution(n, str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";
//		int n = sc.nextInt();
//		String str = sc.next();
//		
//		for (int i = 0; i < n; i++) {
//			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
//			int num = Integer.parseInt(tmp, 2);
//			answer += (char) num;
//			str = str.substring(7);
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for (int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			str = str.substring(7);
		}
		
		System.out.println(answer);
		
		
		br.close();
	}

}
