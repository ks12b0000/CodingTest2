package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3_6 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int[] arr) {
//		int answer = 0;
//		int lt = 0;
//		int cnt = 0;
//		
//		for (int i = 0; i < num; i++) {
//			if (arr[i] == 0) {				// arr[i] 번째가 0이면 cnt를 1씩 증가시켜줌. (cnt = 0을 1로 바꾼 횟수)
//				cnt++;
//			}
//			while (cnt > num2) {			// cnt가 num2 값보다 크면 반복.
//				if (arr[lt] == 0) {			// arr[lt]번째 값이 0이면 cnt를 1감소 시켜줌. (cnt = 0을 1로 바꾼 횟수이므로 lt번째가 0값을 만나면 다시 0으로 만들고 횟수를 1감소 시켜줌.)
//					cnt--;
//				}
//				lt++;						// while문이 반복 될 때마다 lt값 1증가.
//			}
//			answer = Math.max(answer, i - lt + 1);		// i - lt + 1 은 현재 1이 연속된 횟수를 구함.  ex.) 0 - 0 + 1 = 1번 연속됨. 
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_6 T = new Num3_6();
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
//		int cnt = 0;
//		int lt = 0;
//		
//		for (int i = 0; i < num; i++) {
//			if (arr[i] == 0) {
//				cnt++;
//			}
//			while (cnt > num2) {
//				if (arr[lt] == 0) {
//					cnt--;
//				}
//				lt++;
//			}
//			answer = Math.max(answer, i - lt + 1);
//		}
//		
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
		int cnt = 0;
		int lt = 0;
		
		for (int rt = 0; rt < num; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}
			while (cnt > num2) {
				if (arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
