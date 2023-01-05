package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_9 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int[][] arr) {
//		int answer = 0;
//		
//		int sum1;
//		int sum2;
//		
//		for (int i = 0; i < num; i++) {
//			sum1 = 0; sum2 = 0;
//			for (int j = 0; j < num; j++) {
//				sum1 += arr[i][j];				// arr[i][j](ex. arr[0][0~4], arr[1][0~4]) 번째 자리 수를 다 더한 값 sum1에 넣어줌. (행)
//				sum2 += arr[j][i];				// arr[j][i](ex. arr[0~4][0], arr[0~4][1]) 번째 자리 수를 다 더한 값 sum2에 넣어줌. (열)
//			}
//			answer = Math.max(answer, sum1);
//			answer = Math.max(answer, sum2);
//		}
//		
//		sum1 = 0; sum2 = 0;
//		for (int i = 0; i < num; i++) {
//			sum1 += arr[i][i];					// arr[i][i](ex. arr[0][0], arr[1][1]) 번째 자리 수를 다 더한 값 sum1에 넣어줌. (맨 왼쪽 대각선)
//			sum2 += arr[i][num - i - 1];		// arr[i][num - i -1](ex. arr[0][4], arr[1][3]) 번째 자리 수를 다 더한 값 sum2에 넣어줌. (맨 오른쪽 대각선)
//		}
//		answer = Math.max(answer, sum1);		// 현재 있는 answer 값이랑 sum값이랑 비교해서 큰값을 answer에 저장
//		answer = Math.max(answer, sum2);
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_9 T = new Num2_9();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[][] arr = new int[num][num];
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println(T.solution(num, arr));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		int num = sc.nextInt();
//		int[][] arr = new int[num][num];
//		
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		int sum1;
//		int sum2;
//		
//		for (int i = 0; i < num; i++) {
//			sum1 = 0; sum2 = 0;
//			for (int j = 0; j < num; j++) {
//				sum1 += arr[i][j];
//				sum2 += arr[j][i];
//			}
//			answer = Math.max(answer, sum1);
//			answer = Math.max(answer, sum2);
//		}
//		sum1 = 0; sum2 = 0;
//		
//		for (int i = 0; i < num; i++) {
//			sum1 += arr[i][i];
//			sum2 += arr[i][num - i -1];
//		}
//		answer = Math.max(answer, sum1);
//		answer = Math.max(answer, sum1);
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int sum1, sum2;
		for (int i = 0; i < num; i++) {
			sum1 = 0; sum2 = 0;
			for (int j = 0; j < num; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1 = 0; sum2 = 0;
		
		for (int i = 0; i < num; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][num - i - 1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		System.out.println(answer);
		
		br.close();
	}

}
