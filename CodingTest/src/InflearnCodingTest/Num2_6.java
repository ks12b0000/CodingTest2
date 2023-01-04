package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2_6 {
	
	
	
	public static boolean isPrime(int num) {
		if (num == 1) {						// res 값이 1 이면 false return해줌.
			return false;
		}
		for (int i = 2; i < num; i++) {		// 2부터 res값 바로 전 값까지 검증해서.
			if (num % i == 0) {				// res % i 가 0 이 나오면 false return (res를 2 ~ res값 전값 까지 나눈 나머지 값이 0이 나오/)
				return false;
			}
		}
		return true;
	}
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<Integer> solution(int num, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		for (int i = 0; i < num; i++) {
//			int tmp = arr[i];
//			int res = 0;
//			while (tmp > 0) {
//				int t = tmp % 10;
//				res = res * 10 + t;
//				tmp = tmp / 10;
//			}
//			if (isPrime(res)) {
//				answer.add(res);
//			}
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2_6 T = new Num2_6();
//		Scanner sc = new Scanner(System.in); 
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for (int x : T.solution(num, arr)) {
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> answer = new ArrayList<>();
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < num; i++) {
//			int tmp = arr[i];				// tmp에 arr[i] 번째 값을 저장 시킨 후 	
//			int res = 0;					// res 는 일단 0으로 만들어 두고.
//			while (tmp > 0) {				// tmp가 0보다 클 때 int t에 tmp % 10을 해주면 (tmp%10 하면 1의자리 수 나옴)
//				int t = tmp % 10;
//				res = res * 10 + t;			// res * 10 + t 해주면 1의 자리수 res에 저장
//				tmp = tmp / 10;				// tmp에 tmp / 10해주면 10의 자리수 나옴.
//			}
//			if (isPrime(res)) {
//				answer.add(res);
//			}
//		}
//		
//		for (int x : answer) {
//			System.out.print(x + " ");
//		}
//		
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
		
		for (int i = 0; i < num; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if (isPrime(res)) {
				answer.add(res);
			}
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}
}
