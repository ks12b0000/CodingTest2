package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Num4_5 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int[] arr) {
//		int answer = -1;
//		int cnt = 0;
//		
//		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());	// TreeSet = 중복제거 하고 트리구조로 저장하는 방식
//																				// Collections.reverseOrder() = 내림차순 정렬
//		for (int i = 0; i < num; i++) {
//			for (int j = i + 1; j < num; j++) {
//				for (int k = j + 1; k < num; k++) {
//					treeSet.add(arr[i] + arr[j] + arr[k]);					// ex) arr[0] + arr[1] + arr[2] 3개의 숫자를 더해야 하니까.
//				}
//			}
//		}
//		
//		for (int x : treeSet) {			// int x에 treeSet에 저장된 값들을 넣어주면서 cnt를 1씩 증가해줌. ex) cnt가 3이되면 x에 저장된 3번째 숫자를 출력
//			cnt++;
//			if (cnt == num2) {			// cnt가 num2 값이랑 같아지면(num2번째 값) answer에 x를 넣어줌.
//				answer = x;
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num4_5 T = new Num4_5();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0 ; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(num, num2, arr));
//		sc.close();
//	}
	
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = -1;
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
//		
//		for (int i = 0; i < num; i++) {
//			for (int j = i + 1; j < num; j++) {
//				for (int k = j + 1; k < num; k++) {
//					treeSet.add(arr[i] + arr[j] + arr[k]);
//				}
//			}
//		}
//		
//		int cnt = 0;
//		
//		for (int x : treeSet) {
//			cnt++;
//			if (cnt == num2) {
//				answer = x;
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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int k = j + 1; k < num; k++) {
					treeSet.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		int answer = -1;
		int cnt = 0;
		
		for (int x : treeSet) {
			cnt++;
			if (cnt == num2) {
				answer = x;
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
