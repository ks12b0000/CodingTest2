package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_12 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int[][] arr) {
//		int answer = 0;
//		
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {
//				int cnt = 0;
//				for (int k = 0; k < num2; k++) {
//					int pi = 0, pj = 0;
//					for (int s = 0; s < num; s++) {
//						if (arr[k][s] == i) pi = s;
//						if (arr[k][s] == j) pj = s;
//					}
//					if (pi < pj) cnt++;
//				}
//				if (cnt == num2) {
//					answer++;
//				}
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_12 T = new Num2_12();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[][] arr = new int[num2][num];
//		for (int i = 0; i < num2; i++) {
//			for (int j = 0; j < num; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println(T.solution(num, num2, arr));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[][] arr = new int [num2][num];		
//		int answer = 0;
//		for (int i = 0; i < num2; i++) {
//			for (int j = 0; j < num; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		for (int i = 1; i <= num; i++) {		
//			for (int j = 1; j <= num; j++) {	
//				int cnt = 0;
//				for (int k = 0; k < num2; k++) {
//					int pi = 0;
//					int pj = 0;
//					for (int s = 0; s < num; s++) {
//						if (arr[k][s] == i) {
//							pi = s;
//						}
//						if (arr[k][s] == j) {
//							pj = s;
//						}
//					}
//					if (pi < pj) {
//						cnt++;
//					}
//				}
//				if (cnt == num2) {
//					answer++;
//				}
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
		int[][] arr = new int[num2][num];
		int answer = 0;
		
		for (int i = 0; i < num2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				int cnt = 0;
				for (int k = 0; k < num2; k++) {
					int pi = 0;
					int pj = 0;
					for (int s = 0; s < num; s++) {
						if (arr[k][s] == i) pi = s;
						if (arr[k][s] == j) pj = s;
					}
					if (pi < pj) {
						cnt++;
					}
				}
				if (cnt == num2) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
