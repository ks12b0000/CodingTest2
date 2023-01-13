package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num4_3 {
	
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<Integer> solution(int num, int num2, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < num2 - 1; i++) {				// map에 arr[0] ~ arr[num2-1] 까지 key value(횟수) 넣어줌.
//			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//		}
//		int lt = 0;
//		
//		for (int rt = num2 - 1; rt < num; rt++) {			// map에 arr[num2-1] 부터 num 까지 key value 넣고 
//			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
//			answer.add(map.size());							// answer에 key 개수를 넣어줌.
//			map.put(arr[lt], map.get(arr[lt]) - 1);			// 그리고 map에 arr[lt] 자리의 value를 -1 해준다
//			if (map.get(arr[lt]) == 0) {					// 만약 map에 arr[lt]의 value가 0이면
//				map.remove(arr[lt]);						// map에서 삭제해줌.
//			}
//			lt++;											// 그리고 lt + 1
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num4_3 T = new Num4_3();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int x : T.solution(num, num2, arr)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		ArrayList<Integer> answer = new ArrayList<>();
//		HashMap<Integer, Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < num2 - 1; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//		}
//		
//		int lt = 0;
//		
//		for (int rt = num2 - 1; rt < num; rt++) {
//			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
//			answer.add(map.size());
//			map.put(arr[lt], map.get(arr[lt]) - 1);
//			if (map.get(arr[lt]) == 0) {
//				map.remove(arr[lt]);
//			}
//			lt++;
//		}
//		
//		for (int x : answer) {
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine(), " ");		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < num2 - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for (int rt = num2 - 1; rt < num; rt++) {
			map.put(arr[rt],map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if (map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}

}
