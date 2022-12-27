package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num1_1 {
	
	/* 프로그래머스 방식 */
//	public int solution(String str, char t) {
//		int answer = 0;
//		
//		str = str.toUpperCase();   		// toUpperCase = 대문자로 변환
//		t = Character.toUpperCase(t);
//		
////		for (int i = 0; i < str.length(); i++) {
////			if (str.charAt(i) == t) {
////				answer++;
////			}
//		for (char x : str.toCharArray()) {    // 문자 x에 str 문자들 넣어서 x가 t문자랑 일치하면 answer +1
//			if (x == t) {
//				answer++;
//			}
//		}
//		
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		Num1_1 T = new Num1_1();
//	    Scanner sc = new Scanner(System.in);
//	    	    
//	    String str = sc.next();
//	    char c = sc.next().charAt(0);
//
//	    System.out.print(T.solution(str, c));	    
//	  }
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    
//	    int answer = 0;
//	    
//	    String str = sc.next();
//	    char c = sc.next().charAt(0);
//	    
//	    str = str.toUpperCase();
//	    c = Character.toUpperCase(c);
//	    
//	    for (int i = 0; i < str.length(); i++) {
//	    	if (str.charAt(i) == c) {
//	    		answer++;
//	    	}
//	    }
//	    System.out.println(answer);
//	    
//	  }
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		
		String str = br.readLine();
		char c = (char) br.read();
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (int i = 0; i < str.length(); i++) {        // str i번째 문자들이 c랑 일치하면 answer + 1
			if (str.charAt(i) == c) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}
}
