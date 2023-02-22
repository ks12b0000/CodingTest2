package InflearnCodingTest;

import java.util.Scanner;

public class Num6_2 {
	public int[] solution(int num, int[] arr) { // 버블정렬
		int[] answer = new int[arr.length];
		int tmp = 0;
		
		for (int i = 0; i < arr.length; i++) { // 0 ~ arr의 길이 전까지
			for (int j = 1; j < arr.length - i; j++) { // 1 ~ arr의 길이 - i 전까지
				if (arr[j - 1] > arr[j]) { // 만약 arr[j-1]값이 arr[j]보다 크면
					tmp = arr[j - 1]; // tmp = arr[j - 1]값을 넣어주고
					arr[j - 1] = arr[j]; // arr[j - 1]에 arr[j]값을 넣어주고
					arr[j] = tmp; // arr[j]에 tmp값을 넣어줌
				}
			}
		}
		answer = arr;
		return answer;
	}
	public static void main(String[] args) {
		Num6_2 T = new Num6_2();
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
