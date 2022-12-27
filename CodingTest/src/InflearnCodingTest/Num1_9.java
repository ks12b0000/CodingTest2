package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_9 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(String str) {
//		int answer = 0;
//		str = str.toUpperCase().replaceAll("[A-Z]", "");	// str을 대문자로 바꿔주고 A-Z까지의 알파벳 값이면 지워줌.
//		answer = Integer.parseInt(str);						// str을 int로 바꿔서 answer에 저장.
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_9 T = new Num1_9();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		String str = sc.next().toUpperCase().replaceAll("[A-Z]", "");
//		answer = Integer.parseInt(str);
//		System.out.println(answer);		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase().replaceAll("[A-Z]", "");
		int answer = Integer.parseInt(str);
		System.out.println(answer);	
		br.close();
	}

}
