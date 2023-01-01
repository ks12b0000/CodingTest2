package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_1 {
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<Integer> solution(int num, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		answer.add(arr[0]);
//		
//		for (int i = 1; i < num; i++) {
//			if (arr[i] > arr[i - 1]) {
//				answer.add(arr[i]);
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_1 T = new Num2_1();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int x : T.solution(num, arr)) {
//			System.out.print(x + " ");
//		}
//		sc.locale();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		int num = sc.nextInt();
//		int[] arr = new int[num];			// num 만큼 arr 배열에 저장가능
//		
//		for (int i = 0; i < num; i++) {		// num 만큼 입력 한 int값 arr 배열에 저장
//			arr[i] = sc.nextInt();
//		}
//		
//		answer.add(arr[0]);					// answer에 arr 0번째 int값은 그대로 저장해줌.
//		
//		for (int i = 1; i < num; i++) { 	// 1번째 자리 int값 부터 마지막 값 자리 수 까지 검증
//			if (arr[i] > arr[i - 1]) {		// arr[i] 번째 자리가 arr[i - 1]번째 자리보다 크면 answer에 저장해줌.
//				answer.add(arr[i]);
//			}
//		}
//		
//		for (int x : answer) {				// int x에 answer 값 담아서 출력해줌.
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> answer = new ArrayList<>();
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		answer.add(arr[0]);
		
		for (int i = 1; i < num; i++) {
			if (arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}

}
