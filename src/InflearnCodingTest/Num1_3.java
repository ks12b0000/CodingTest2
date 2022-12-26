package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1_3 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str) {
//		String answer = "";
//		int m = Integer.MIN_VALUE;
//		String[] s = str.split(" ");		// str 문자열에서 띄어쓰기 한 문자열 별로 나눠서 s 배열에 문자열들을 담고 x에 담아서 
//											// x에 길이가 최소길이 값 보다 크면 최소길이에 담고 answer에 담음
//		for (String x : s) {
//			int len = x.length();
//			if (len > m) {
//				m = len;
//				answer = x;
//			}
//		}
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_3 T = new Num1_3();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(T.solution(str));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String answer = "";
//		int m = Integer.MIN_VALUE;
//		
//		String str = sc.nextLine();
//		String[] s = str.split(" ");
//		
//		for (String x : s) {
//			int len = x.length();
//			if (len > m) {
//				m = len;
//				answer = x;
//			}
//		}
//		
//		System.out.println(answer);
//		
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
//	public static void main (String [] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String answer = "";
//		String str = br.readLine();
//		String[] s = str.split(" ");
//		int min = Integer.MIN_VALUE;
//		
//		for (String x : s) {
//			int len = x.length();
//			if (len > min) {
//				min = len;
//				answer = x;
//			}
//		}
//		
//		System.out.println(answer);
//		
//		br.close();
//	}
	
	
	
	/* while 방식 */
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "";
		String str = br.readLine();
		int min = Integer.MIN_VALUE, pos;
		
		while ((pos = str.indexOf(' ')) != -1) {	// str 문자열에 띄어쓰기가 처음 발생한 곳 찾음  못찾으면 종료
			String tmp = str.substring(0, pos);		// str 문자열에 시작 부분부터 pos 번째 자리까지 자름
			int len = tmp.length();
			if (len > min) {
				min = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);			// 로직 검증 후 검증 된 문자열들 자르고 띄어쓰기 발생한 번째수 +1 번째부터 다시 str에 담아서 검증
		}
		if (str.length() > min) {					// 마지막 문자열 부분 띄어쓰기는 while문에 띄어쓰기 검증이 안되므로
			answer = str;							// 직접 검증해줘서 최소값 보다 크면 answer에 담음
		}
		System.out.println(answer);
		
		br.close();
	}
}
