package InflearnCodingTest;

import java.util.Scanner;

public class Num8_4 {
	static int answer = 0, n, m;
	public void DFS(int L, int sum, int time, int[] a, int[] b) {
		if (time > m) return;
		if (L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L + 1, sum + a[L], time + b[L], a, b);
			DFS(L + 1, sum, time, a, b);
		}
	}
	public static void main(String[] args) {
		Num8_4 T = new Num8_4();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
		sc.close();
	}
}
