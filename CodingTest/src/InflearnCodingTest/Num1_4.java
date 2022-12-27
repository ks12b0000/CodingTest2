package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Num1_4 {
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<String> solution(int num, String[] str) {
//		ArrayList<String> answer = new ArrayList<>();
//		
//		for (String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
//		
//		return answer;
//	}
//	
//	public static void main(String [] args) {
//		Num1_4 T = new Num1_4();
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String str[] = new String[num];
//		for (int i = 0; i < num; i++) {
//			str[i] = sc.next();
//		}
//		for (String x : T.solution(num, str)) {
//			System.out.println(x);
//		}
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String[] str = new String[num];
//		
//		for (int i = 0; i < num; i++) {
//			str[i] = sc.next();				// num개수 만큼 str 입력 
//		}
//		
//		for (String x : str) {				// x에 str 하나씩 담은 다음 new StringBuilder(x).reverse() 사용하여 문자열 뒤집어줌.
//			String tmp = new StringBuilder(x).reverse().toString();
//			System.out.println(tmp);
//		}
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		
		for (int i = 0; i < num; i++) {
			str[i] = br.readLine();
		}
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			System.out.println(tmp);
		}
		
		br.close();
	}
}
