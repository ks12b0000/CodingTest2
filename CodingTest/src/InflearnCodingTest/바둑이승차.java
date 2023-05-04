package InflearnCodingTest;

import java.util.Scanner;

public class 바둑이승차 {
	static int c;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		c = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				
		DFS(c, arr, 0, 0);
		System.out.println(max);
		sc.close();
	}
	static void DFS(int c, int[] arr, int sum, int idx) {
		if (sum > c) {			
			return;
		}
		if (idx > arr.length - 1) {
			max = Math.max(sum, max);
		}
		else {
			DFS(c, arr, sum + arr[idx], idx + 1);			
			DFS(c, arr, sum, idx + 1);			
		}
	}
}
