package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_11 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int[][] arr) {
//		int answer = 0;
//		int max = 0;
//		
//		for (int i = 1; i <= num; i++) {			// 1번 학생이 j 학생이랑 같은 k 반인 경우 cnt 1씩증가. 
//			int cnt = 0;
//			for (int j = 1; j <= num; j++) {
//				for (int k = 1; k <= 5; k++) {
//					if (arr[i][k] == arr[j][k]) {
//						cnt++;
//						break;
//					}
//				}
//			}
//			if (cnt > max) {						// 1~5번 학생의 cnt수를 다 구해서 가장 큰값 구하고. answer에 학생 번호 i를 넣어줌.
//				max = cnt;
//				answer = i;
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_11 T = new Num2_11();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[][] arr = new int[num + 1][6];			// 학생 번호, 학년을 1번부터 시작하기 위해 한 배열씩 추가해줌.
//		for (int i = 1; i <= num; i++) {			// 학생 번호 1~5 
//			for (int j = 1; j <= 5; j++) {			// 학년은 5학년 까지
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println(T.solution(num, arr));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[][] arr = new int[num + 1][6];
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= 5; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		int answer = 0;
//		int max = 0;
//		
//		for (int i = 1; i <= num; i++) {
//			int cnt = 0;
//			for (int j = 1; j <= num; j++) {
//				for (int k = 1; k <= 5; k++) {
//					if (arr[i][k] == arr[j][k]) {
//						cnt++;
//						break;
//					}
//				}
//			}
//			if (cnt > max) {
//				max = cnt;
//				answer = i;
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
		int[][] arr = new int[num + 1][6];
		for (int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		int max = 0;
		
		for (int i = 1; i <= num; i++) {
			int cnt = 0;
			for (int j = 1; j <= num; j++) {
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
