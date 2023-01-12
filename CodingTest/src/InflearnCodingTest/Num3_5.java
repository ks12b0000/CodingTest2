package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num3_5 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num) {
//		int answer = 0;
//		int sum = 0;
//		int lt = 0;
//		int num2 = num / 2 + 1;		// num2를 만든 이유는 num / 2 + 1 까지의 값 까지만 연속된 자연수가 있으면 되니까.
//		
//		int[] arr = new int[num2];
//		
//		for (int i = 0; i < num2; i++) {
//			arr[i] = i + 1;			// arr[i] = 1~8
//		}
//		
//		for (int i = 0; i < num2; i++) {
//			sum += arr[i];
//			if (sum == num) {
//				answer++;
//			}
//			while (sum >= num) {
//				sum -= arr[lt++];
//				if (sum == num) {
//					answer++;
//				}
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_5 T = new Num3_5();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(T.solution(num));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int answer = 0;
//		int sum = 0;
//		int lt = 0;
//		int num2 = num / 2 + 1;
//		int[] arr = new int[num2];
//		
//		for (int i = 0; i < num2; i++) {
//			arr[i] = i + 1;
//		}
//		
//		for (int i = 0; i < num2; i++) {
//			sum += arr[i];
//			if (sum == num) {
//				answer++;
//			}
//			while (sum >= num) {
//				sum -= arr[lt++];
//				if (sum == num) {
//					answer++;
//				}
//			}
//		}
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int sum = 0;
		int lt = 0;
		int num2 = num / 2 + 1;
		int[] arr = new int[num2];
		
		for (int i = 0; i < num2; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < num2; i++) {
			sum += arr[i];
			if (sum == num) {
				answer++;
			}
			while (sum >= num) {
				sum -= arr[lt++];
				if (sum == num) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
