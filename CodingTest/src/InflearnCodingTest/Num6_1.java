package InflearnCodingTest;

import java.util.Scanner;

public class Num6_1 {
	public int[] solution(int num, int[] arr) { // 선택정렬
		int[] answer = new int[arr.length];

		
		for (int i = 0; i < arr.length - 1; i++) { // 0 ~ arr의 길이 - 1 전까지
			int idx = i; // idx = i
			for (int j = i + 1; j < arr.length; j++) { // i + 1 ~ arr의 길이 전까지
				if (arr[j] < arr[idx]) { // 만약 arr[j]가 arr[idx]보다 작으면 idx = j
					idx = j;					
				}
			}
			int tmp = arr[i]; // int tmp에 arr[i]값 넣어주고
			arr[i] = arr[idx]; // arr[i]에 arr[idx]값 넣어주고
			arr[idx] = tmp; // arr[idx]에 tmp값 넣어줌
		}
		answer = arr;
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_1 T = new Num6_1();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : T.solution(num, arr)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
