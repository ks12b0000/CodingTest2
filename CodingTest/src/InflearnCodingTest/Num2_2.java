package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_2 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int[] arr) {
//		int answer = 1, max = arr[0]; 
//				
//		for (int i = 1; i < num; i++) {
//			if (arr[i] > max) {
//				answer++;
//				max = arr[i];
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_2 T = new Num2_2();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(num, arr));
//		sc.locale();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 1;							// 맨 앞자리 학생은 무조건 보이니까 1부터 시작.
//		
//		int num = sc.nextInt();
//		int[] arr = new int[num];				// num 만큼 arr배열에 저장
//		
//		for (int i = 0; i < num; i++) {			// num 만큼 입력한 값 arr[i] 번째에 저장
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = arr[0];						// 처음 제일 큰 학생은 0번째에 있는 값으로 저장
//		
//		for (int i = 1; i < num; i++) { 		// 첫번째값 부터 마지막 값 까지 검증
//			if (arr[i] > max) {					// arr[i] 번째 값이 max 값 보다 크면 answer 를 1증가 시켜주고 max에 값 저장시켜줌.
//				answer++;
//				max = arr[i];
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

		int answer = 1;
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0];
		
		for (int i = 1; i < num; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
