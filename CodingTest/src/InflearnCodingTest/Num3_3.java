package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3_3 {
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int[] arr) {
//		int answer = 0;
//		int tmp = 0;
//		for (int i = 0; i < num2; i++) {
//			tmp += arr[i];					// arr[0] + arr[1] + arr[2] = 38 처음 3개의 숫자를 더해줌.
//		}
//		answer = tmp;
//		for (int i = num2; i < num; i++) {		// num2 값 부터 num 값까지 반복. 처음 3개 숫자 더한 값 에서 arr[i] - arr[i - num2] 값 해주면 첫번째 숫자를 제외하고 그 뒤에 3개의 숫자 합이나옴.
//			tmp += (arr[i] - arr[i - num2]);	// 38 + (arr[3] - arr[3-3]) = 46  / 46 + (arr[4] - arr[4-3]) = 56
//			answer = Math.max(answer, tmp);		// 38, 46 answer = 46    / 46 , 56  answer = 56
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_3 T = new Num3_3();
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
//		
//		for (int i = 0; i < num2; i++) {
//			sum += arr[i];
//		}
//		answer = sum;
//		
//		for (int i = num2; i < num; i++) {
//			sum += (arr[i] - arr[i - num2]);
//			answer = Math.max(answer, sum);
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
		int sum = 0;
		
		for (int i = 0; i < num2; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for (int i = num2; i < num; i++) {
			sum += (arr[i] - arr[i - num2]);
			answer = Math.max(answer, sum);
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
