package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_3 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(int num, int[] arr, int[] arr2) {
//		String answer = "";
//		for (int i = 0; i < num; i++) {
//			if(arr[i] == arr2[i]) {
//				answer += "D";
//			}
//			else if ((arr[i] == 1 && arr2[i] == 2) || (arr[i] == 3 && arr2[i] == 1) || (arr[i] == 2 && arr2[i] == 3)) {
//				answer += "B";
//			}
////			else if ((arr[i] == 1 && arr2[i] == 3) || (arr[i] == 2 && arr2[i] == 1) || (arr[i] == 3 && arr2[i] == 2)) {
////				answer += "A";
////			}
//			else {
//				answer += "A";
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_3 T = new Num2_3();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		int[] arr2 = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < num; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (char x : T.solution(num, arr, arr2).toCharArray()) {
//			System.out.println(x);
//		}
//		
//		sc.close();
//	}
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";
//		int num = sc.nextInt();
//		int[] arr = new int[num];				// num 만큼 arr배열에 저장 가능.
//		int[] arr2 = new int[num];				// num 만큼 arr2배열에 저장 가능.
//		
//		for (int i = 0; i < num; i++) {			// num 만큼 입력 받아 arr 배열에 저장
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < num; i++) {			// num 만큼 입력 받아 arr2 배열에 저장
//			arr2[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < num; i++) {			// 첫번째 값 부터 마지막 값 까지 검증
//			if (arr[i] == arr2[i]) {			// 만약 arr[i] 번째 자리 값이 arr2[i] 번째 값이랑 같으면 "D"를 출력.
//				answer += "D";
//			}									// arr이 arr2 한테 가위 바위 보 졌을 경우의 수 넣어서 B출력
//			else if ((arr[i] == 1 && arr2[i] == 2) || (arr[i] == 3 && arr2[i] == 1) || (arr[i] == 2 && arr2[i] == 3)) {
//				answer += "B";
//			}
//			else {
//				answer += "A";
//			}
//		}
//		
//		for (char x : answer.toCharArray()) {
//			System.out.println(x);
//		}
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] arr2 = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
		
		for (int i = 0; i < num; i++) {
			if (arr[i] == arr2[i]) {
				answer += "D";
			}
			else if ((arr[i] == 1 && arr2[i] == 2) || (arr[i] == 3 && arr2[i] == 1) || (arr[i] == 2 && arr2[i] == 3)) {
				answer += "B";
			}
			else {
				answer += "A";
			}
		}
		
		for (char x : answer.toCharArray()) {
			System.out.println(x);
		}

		br.close();
	}

}
