package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Num2_4 {
	
	
	/* 프로그래머스 방식 */
//	public int[] solution(int num) {
//		int[] answer = new int[num];
//		answer[0] = 1;
//		answer[1] = 1;
//		for (int i = 2; i < num; i++) {
//			answer[i] = answer[i - 2] + answer[i - 1]; 
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_4 T = new Num2_4();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for (int x : T.solution(num)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] answer = new int[num];			// answer 배열에 num 개수 만큼 저장.
//		
//		answer[0] = 1;							// answer 0,1 번째 자리 값은 1 고정이므로 1 넣어둠.
//		answer[1] = 1;
//		
//		for (int i = 2; i < num; i++) {			// answer 2번째 자리 값 부터 마지막 자리 값 까지 검증.
//			answer[i] = answer[i - 2] + answer[i - 1];		// answer[i] 번째 값은 answer[i - 2] + answer[i - 1] 값을 저장.
//		}
//		
//		for (int x : answer) {
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] answer = new int[num];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for (int i = 2; i < num; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}

}
