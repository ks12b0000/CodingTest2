package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

public class Num2_8 {
	
	
	/* 프로그래머스 방식 */
//	public int[] solution(int num, int[] arr) {
//		int[] answer = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			int cnt = 1;
//			for (int j = 0; j < num; j ++) {
//				if (arr[j] > arr[i]) {			// arr[j]가(0~4번째 자리 수) arr[i] 보다 클 때 마다 cnt를 1씩 증가시켜줌.
//					cnt++;						// arr[0] 번째 자리가 arr[0~4] 보다 작으면 등수가 낮아지기 때문.
//				}
//			}
//			answer[i] = cnt; 
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_8 T = new Num2_8();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int x : T.solution(num, arr)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		int[] answer = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < num; i++) {
//			int cnt = 1;
//			for (int j = 0; j < num; j++) {
//				if (arr[j] > arr[i]) {
//					cnt++;
//				}
//			}
//			answer[i] = cnt;
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
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] answer = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < num; i++) {
			int cnt = 1;
			for (int j = 0; j < num; j++) {
				if (arr[i] < arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}

}
