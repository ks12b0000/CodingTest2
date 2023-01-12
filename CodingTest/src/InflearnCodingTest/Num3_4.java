package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3_4 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int[] arr) {
//		int answer = 0;
//		int sum = 0;
//		int lt = 0;
//		
//		for (int i = 0; i < num; i++) {
//			sum += arr[i];			// sum 에 arr[i] 번째 값들을 다 더해서 넣어줌.
//			if (sum == num2) {		// 더했을 때 sum이 num2 값이 나오면 answer를 1증가 시켜줌.
//				answer++;
//			}		
//			while (sum >= num2) {	// sum 값이 num2 보다 크거나 같으면 sum - arr[lt] 를 해주고 lt를 1 증가시켜줌
//				sum -= arr[lt++];
//				if (sum == num2) {	// sum 값이 num2 랑 같으면 answer를 1 증가.
//					answer++;
//				}
//			}
//		}
//		// arr[3]까지 더하면 7  while에서 7 -= arr[0] = 6 answer ++ lt++
//		// while에서 6 -= arr[1] = 4   lt++
//		// 4 + arr[4] + arr[5] = 6 answer ++ 
//		// while에서 6 -= arr[2] = 5   lt ++
//		// 5 + arr[6] = 6 answer ++  while에서 6 - arr[3] = 3
//		// 3 + arr[7] = 5
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_4 T = new Num3_4();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(num, num2, arr));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int answer = 0;
//		int sum = 0;
//		int lt = 0;
//		
//		for (int i = 0; i < num; i++) {
//			sum += arr[i];
//			if (sum == num2) {
//				answer++;
//			}
//			while (sum >= num2) {
//				sum -= arr[lt++];
//				if (sum == num2) {
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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int sum = 0;
		int lt = 0;
		
		for (int i = 0; i < num; i++) {
			sum += arr[i];
			if (sum == num2) {
				answer++;
			}
			while (sum >= num2) {
				sum -= arr[lt++];
				if (sum == num2) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
