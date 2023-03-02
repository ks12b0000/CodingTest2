package InflearnCodingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num8_6 {
	static int answer = Integer.MAX_VALUE, n, m;
	public void DFS(int L, int sum, Integer[] arr) {
		if (L >= answer) return;
		if (sum > m) return;
		if (sum == m) {
			answer = Math.min(answer, L);
		}
		else {
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + arr[i], arr);
			}
		}
	}
	public static void main(String[] args) {
		Num8_6 T = new Num8_6();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m = sc.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
		sc.close();
	}
}
