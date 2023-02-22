package InflearnCodingTest;

import java.util.Scanner;

public class Num6_3 {
	public int[] solution(int num, int[] arr) { // 삽입정렬
		int[] answer = new int[arr.length];
		
		// 방법 1
//		for (int i = 1; i < arr.length; i++) { // 1 ~ arr길이 전 까지
//			int tmp = arr[i], j; // int tmp = arr[i], int j;
//			for (j = i - 1; j >= 0; j--) { // j = i - 1 ~ 0이랑 같거나 클때까지
//				if (arr[j] > tmp) { // arr[j] > tmp면 arr[j + 1]에 arr[j]값 넣어줌
//					arr[j + 1] = arr[j];
//				}
//				else { // arr[j] > tmp가 아니면 멈춤
//					break;
//				}				
//			} // arr[j + 1] = tmp 넣어줌
//			arr[j + 1] = tmp;
//		}
		
		// 방법 2
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i]; // tmp = arr[i]값 넣어줌
			int prev = i - 1; // prev = i - 1값 넣어줌
			while ((prev >= 0) && arr[prev] > tmp) { // prev >= 0 이고 arr[prev] > tmp 이면
				arr[prev + 1] = arr[prev]; // arr[prev + 1] = arr[prev] 값 넣어줌
				prev--;  // 그러고 prev--
			}
			arr[prev + 1] = tmp; // arr[prev + 1] = tmp넣어줌
		}
		
		answer = arr;
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_3 T = new Num6_3();
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
