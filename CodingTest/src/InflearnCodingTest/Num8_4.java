package InflearnCodingTest;

import java.util.Scanner;

public class Num8_4 {
	static int[] pm;
	static int n, m;
	public void DFS(int L) {
		if (L == m) {
			for (int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}
	public static void main(String[] args) {
		Num8_4 T = new Num8_4();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		T.DFS(0);
		sc.close();
	}
}
