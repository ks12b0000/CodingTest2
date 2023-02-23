package InflearnCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Num6_6 {
	public int[] solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();
//		for (int i = 0; i < n; i++) { // 처음에는 직접 tmp에 arr배열값들을 넣어줬는데. arr.clone()를 사용하면 복사됨.
//			tmp[i] = arr[i];
//		}		
		Arrays.sort(tmp); // tmp를 정렬해줌 (arr배열이랑 tmp배열이랑 비교 위해서)
		
		for (int i = 0; i < n; i++) { // 0 ~ n 전까지
			if (arr[i] != tmp[i]) { // 만약 arr[i]랑 tmp[i]랑 다른 값이 있으면 철수랑 철수 짝꿍임.
				answer.add(i + 1); // answer에 i + 1해서 넣어줌(우린 0부터 시작 문제는 1부터시작이므로)
			}
		}
		
		return answer.stream().mapToInt(x -> x).toArray();
	}
	public static void main(String[] args) {
		Num6_6 T = new Num6_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int y : T.solution(n, arr)) {
			System.out.print(y + " ");
		}
		sc.close();
	}
}
