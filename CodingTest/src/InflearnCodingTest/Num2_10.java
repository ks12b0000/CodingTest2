package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_10 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int[][] arr) {
//		int answer = 0;
//													// 격자의 가장자리는 0으로 만듦.
//		for (int i = 0; i < num + 2; i++) {			// 0 ~ num + 2 까지 
//			arr[0][i] = 0;							// 0번째 부터 i자리 까지 0으로 직접 만들어 놓음.
//			arr[i][0] = 0;							// i번째 부터 0자리 까지 0으로 직접 만들어 놓음.
//			arr[i][num + 1] = 0;					// i번째 부터 num + 1자리 까지 0으로 직접 만들어 놓음.
//			arr[num + 1][i] = 0;					// num + 1번째 부터 i 자리 까지 0으로 직접 만들어 놓음.
//		}
//		
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {		// 1 부터 num 값 까지 검증
//				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] &&	// 현재 검증하고 있는 값이 상하좌우 보다 크면 answer++ 
//						arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) {
//					answer++;
//				}
//			}
//		}
//	
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_10 T = new Num2_10();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[][] arr = new int[num + 2][num + 2];			// num + 2 만큼 배열에 저장.
//		for (int i = 1; i <= num; i++) {					// num 만큼만 입력할 수 있게 해둠.
//			for (int j = 1; j <= num; j++) {
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
//		int[][] arr = new int[num + 2][num + 2];
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		for (int i = 0; i < num + 2; i++) {
//			arr[0][i] = 0;
//			arr[i][0] = 0;
//			arr[i][num + 1] = 0;
//			arr[num + 1][i] = 0;
//		}
//		
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {
//				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] &&
//						arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) {
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
		int answer = 0;
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num + 2][num + 2];
		for (int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < num + 2; i++) {
			arr[0][i] = 0;
			arr[i][0] = 0;
			arr[i][num + 1] = 0;
			arr[num + 1][i] = 0;
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] &&
						arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
