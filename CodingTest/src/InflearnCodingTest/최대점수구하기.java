package InflearnCodingTest;

import java.util.Scanner;

public class 최대점수구하기 {
	static int m, max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		DFS(m, 0, arr, 0, 0);
		System.out.println(max);
		
		sc.close();
	}
	static void DFS(int m, int idx, int[][] arr, int sum, int total) {
		if (sum > m) return;
		if (idx > arr.length - 1) {
			max = Math.max(total, max);
		}
		else {
			DFS(m, idx + 1, arr, sum + arr[idx][1], total + arr[idx][0]);
			DFS(m, idx + 1, arr, sum, total);
		}
	}
}	
