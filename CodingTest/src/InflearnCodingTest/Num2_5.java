package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num2_5 {
	
	/* 프로그래머스 방식 */
//	public int solution(int num) {
//		int answer = 0;
//		int[] arr = new int[num + 1];
//		
//		for (int i = 2; i <= num; i++) {
//			if (arr[i] == 0) {
//				answer++;
//				for (int j = i; j <= num; j = j + i) {
//					arr[j] = 1;
//				}
//			}
//		}
//		
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_5 T = new Num2_5();
//		Scanner sc = new Scanner(System.in); 
//		int num = sc.nextInt();
//		System.out.println(T.solution(num));
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		int num = sc.nextInt();
//		int[] arr = new int[num + 1];			// arr 배열에 num + 1 만큼 저장.
//		
//		for (int i = 2; i <= num; i++) {		// arr[2] 번째 부터 num 까지 검증.
//			if (arr[i] == 0) {					// 만약 arr[i] 번째가 0 이면 answer 1 증가.
//				answer++;
//				for (int j = i; j <= num; j = j + i) {		// 만약 arr[j] 번째가 i 번째 값의 배수들이면 1로 저장
//					arr[j] = 1;
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
		int[] arr = new int[num + 1];
		
		for (int i = 2; i <= num; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i; j <= num; j = j + i) {
					arr[j] = 1;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
