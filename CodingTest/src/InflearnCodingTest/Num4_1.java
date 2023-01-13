package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num4_1 {
	
	
	/* 프로그래머스 방식 */
//	public char solution(int num, String str) {
//		char answer = ' ';
//		HashMap<Character, Integer> map = new HashMap<>(); // HashMap을 사용해서 key, value로 저장 key = 문자('A') value = 숫자(1)
//		
//		for (char x : str.toCharArray()) {			// char x에 str 문자들을 다 넣어줌.
//			map.put(x, map.getOrDefault(x, 0) + 1);		// map.put = map에 저장 시킨다. x를(key) map.getOrDefault = x를 찾는데 없으면 key = x value = 0을 넣어줌. + 1 하는 이유는 찾으면 횟수가 1 증가해야되기 때문.
//		}
//		int max = 0;
//		
//		for (char key : map.keySet()) {			// char key 에 map.keySet(map에 있는 key 꺼내서) 넣어줌.
//			if (map.get(key) > max) {			// map.get(key) value 값을 꺼내줘서 max보다 크면
//				max = map.get(key);				// max = value 값을 넣어줌.
//				answer = key;					// value가 제일 큰 key를 answer에 넣어줌.
//			}
//		}
//				
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num4_1 T = new Num4_1();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String str = sc.next();
//		System.out.println(T.solution(num, str));
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String str = sc.next();
//		
//		char answer = ' ';
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		for(char x : str.toCharArray()) {
//			map.put(x, map.getOrDefault(x, 0) + 1);
//		}
//		
//		int max = Integer.MIN_VALUE;
//		
//		for (char key : map.keySet()) {
//			if (map.get(key) > max) {
//				max = map.get(key);
//				answer = key;
//			}
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		
		
		for (char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
