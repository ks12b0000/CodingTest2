package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_7 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int[] arr) {
//		int answer = 0;
//		int n = 0;
//		
//		for (int i = 0; i < num; i++) {
//			if (arr[i] == 1) {
//				n++;
//				answer += n;
//			}
//			else {
//				n = 0;
//			}			
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_7 T = new Num2_7();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(num, arr));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int answer = 0;
//		int n = 0;
//		
//		for (int i = 0; i < num; i++) {
//			if (arr[i] == 1) {				// 만약 arr[i]번째 값이 1이면 n을 1증가 시켜주고 answer에 n값을 더해준다.
//				n++;
//				answer += n;
//			}
//			else {							// 1이 아니면 n을 다시 0으로 만들어줌.
//				n = 0;
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
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int n = 0;
		
		for (int i = 0; i < num; i++) {
			if (arr[i] == 1) {
				n++;
				answer += n;
			}
			else {
				n = 0;
			}
		}
		System.out.println(answer);
		
		br.close();
	}

}
