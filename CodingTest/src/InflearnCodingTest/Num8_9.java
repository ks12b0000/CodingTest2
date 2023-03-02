package InflearnCodingTest;

import java.util.Scanner;

public class Num8_9 {
	static int[] ch, p, b;
	static int n, f;
	boolean flag = false;
	int[][] dy = new int[35][35];
	public int combi(int n, int f) {
		if (dy[n][f] > 0) return dy[n][f];
		if (n == f || f == 0) return 1;
		else return dy[n][f] = combi(n - 1, f - 1) + combi(n - 1, f);
	}
	public void DFS(int L, int sum) {
		if (flag) return;
		if (L == n) {
			if (sum == f) {
				for (int x : p) {
					System.out.print(x + " ");
					flag = true;
				}
			}
		}
		else {
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L + 1, sum + (p[L] * b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Num8_9 T = new Num8_9();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = sc.nextInt();
		p = new int[n];
		b = new int[n];
		ch = new int[n + 1];
		for (int i = 0; i < n; i++) {
			b[i] = T.combi(n - 1, i);
		}
		T.DFS(0, 0);
		sc.close();
	}
}
