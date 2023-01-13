package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Num4_2 {
	
	
	
	/* 프로그래머스 방식 */
//	public String solution(String str, String str2) {
//		String answer = "YES";
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		for (char x : str.toCharArray()) {				// char x 에 str문자들을 넣어줌.
//			map.put(x, map.getOrDefault(x, 0) + 1);		// mpa에 key = x, value = 1
//		}
//		
//		for (char x : str2.toCharArray()) {				// char x에 str2 문자들을 넣어줌.
//			if (!map.containsKey(x) || map.get(x) == 0) {	// 넣을때 만약 map에 x key가 들어있지 않거나, x key value가 0이면 return NO
//				return "NO";
//			}
//			map.put(x, map.get(x) - 1);					// map에 존재하면 x key value를 -1 해줌.
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num4_2 T = new Num4_2();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		String str2 = sc.next();
//		System.out.println(T.solution(str, str2));
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		String str2 = sc.next();
//		String answer = "YES";
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		for (char x : str.toCharArray()) {
//			map.put(x, map.getOrDefault(x, 0) + 1);
//		}
//		
//		for (char x : str2.toCharArray()) {
//			if (!map.containsKey(x) || map.get(x) == 0) {
//				answer = "NO";
//			}
//			map.put(x, map.get(x) - 1);
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = br.readLine();
		String answer = "YES"; 
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for (char x : str2.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) {
				answer = "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
