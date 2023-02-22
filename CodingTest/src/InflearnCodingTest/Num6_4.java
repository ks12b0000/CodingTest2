package InflearnCodingTest;

import java.util.Scanner;

public class Num6_4 {
	public int[] solution(int num, int num2, int[] arr) {
		int[] answer = new int[num];
		
		for (int x : arr) { // int x에 arr을 하나씩 담아줌
			int pos = -1; // 일단 pos는 -1로 지정
			for (int i = 0; i < num; i++) { // 0 ~ num 전 까지
				if (x == answer[i]) { // x가 answer안에 들어가있으면
					pos = i; // pos = i로 저장
				}
			}
			if (pos == -1) { // 만약 pos가 -1이면(x가 answer에 없음)
				for (int j = num - 1; j >= 1; j--) { // num - 1 ~ 1 까지 
					answer[j] = answer[j - 1]; // answer[j] = answer[j - 1] 한칸씩 이동시켜줌
				}
			}
			else { // answer안에 x가 들어가있으면
				for (int j = pos; j >= 1; j--) { // pos ~ 1 까지
					answer[j] = answer[j - 1]; // 한칸씩 이동시켜줌
				}					
			}
			answer[0] = x; // answer[0] 자리에 x값 넣어줌
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_4 T = new Num6_4();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int[] arr = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : T.solution(num, num2, arr)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
