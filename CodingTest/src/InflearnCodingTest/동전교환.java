package InflearnCodingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
	static int m;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
				
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		m = sc.nextInt();
		DFS(arr, 0, 0);
		System.out.println(min);
			
		sc.close();
	}
	static void DFS(Integer[] arr, int cnt, int sum) {
		if (cnt >= min) {
			return;
		}
		if (sum > m) {			
			return;
		}
		if (sum == m) {
			min = Math.min(min, cnt);
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				DFS(arr, cnt + 1, sum + arr[i]);
			}
		}
	}
}
