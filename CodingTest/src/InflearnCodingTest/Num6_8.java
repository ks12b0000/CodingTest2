package InflearnCodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Num6_8 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // arr을 정렬해줌
		
		for (int i = 0; i < n; i++) { // 0 ~ n전까지
			if (arr[i] == m) { // arr[i]랑 m값이랑 같으면 answer에 i + 1값 넣어줌.
				answer = i + 1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_8 T = new Num6_8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
		sc.close();
	}
}
