package InflearnCodingTest;

import java.util.Scanner;

public class Num2_12 {
	public int solution(int num, int num2, int[][] arr) {
		int answer = 0;
		
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < num; j++) {
				
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num2_12 T = new Num2_12();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int[][] arr = new int[num2][num];
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(num, num2, arr));
		sc.close();
	}

}
