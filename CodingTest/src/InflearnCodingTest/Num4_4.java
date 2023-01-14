package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Num4_4 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(String str, String str2) {
//		int answer = 0;
//		HashMap<Character, Integer> map = new HashMap<>();
//		HashMap<Character, Integer> map2 = new HashMap<>();
//		
//		for (char x : str2.toCharArray()) {				// char x에 일단 str2의 문자들을 저장.
//			map2.put(x, map2.getOrDefault(x, 0) + 1);	// map2에 key = x  value = 1  문자랑 횟수 저장.
//		}
//		
//		for (int i = 0; i < str2.length() - 1; i++) {	// 0 ~ str2.length - 1 만큼 
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);	  // map에 str 문자랑 횟수 저장. 
//		}
//		
//		int lt = 0;
//		for (int rt = str2.length() - 1; rt < str.length(); rt++) {				// str2.length -1 부터 str.length 까지
//			map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt), 0) + 1);	// map에 key value 저장.
//			if (map.equals(map2)) {						// 만약 map 값이 map2 값이랑 같으면 answer를 1 증가.
//				answer++;
//			}
//			map.put(str.charAt(lt), map.get(str.charAt(lt)) - 1);		// 그러고 str문자열에서 lt 번째 문자를 -1 해줌.
//			if (map.get(str.charAt(lt)) == 0) {							// str문자열에서 lt 번째 문자의 value가 0이면
//				map.remove(str.charAt(lt));								// map에서 문자를 삭제해줌.
//			}
//			lt++;										// 그러고 lt 증가
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num4_4 T = new Num4_4();
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
//		int answer = 0;
//		
//		HashMap<Character, Integer> map = new HashMap<>();
//		HashMap<Character, Integer> map2 = new HashMap<>();
//		
//		for (char x : str2.toCharArray()) {
//			map2.put(x, map2.getOrDefault(x, 0) + 1);
//		}
//		
//		for (int i = 0; i < str2.length() - 1; i++) {
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//		}
//		
//		int lt = 0;
//		
//		for (int rt = str2.length() - 1; rt < str.length(); rt++) {
//			map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt), 0) + 1);
//			if (map.equals(map2)) {
//				answer++;
//			}
//			map.put(str.charAt(lt), map.get(str.charAt(lt)) - 1);
//			if (map.get(str.charAt(lt)) == 0) {
//				map.remove(str.charAt(lt));
//			}
//			lt++;
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
		int answer = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for (char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}
		
		for (int i = 0; i < str2.length() - 1; i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		
		for (int rt = str2.length() - 1; rt < str.length(); rt++) {
			map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt), 0) + 1);
			if (map.equals(map2)) {
				answer++;
			}
			map.put(str.charAt(lt), map.get(str.charAt(lt)) - 1);
			if (map.get(str.charAt(lt)) == 0) {
				map.remove(str.charAt(lt));
			}
			lt++;
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
