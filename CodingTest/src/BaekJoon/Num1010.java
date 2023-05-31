package BaekJoon;

import java.util.Scanner;

public class Num1010 {
	static int[][] dp = new int[30][30];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println(combi(m, n));
		}
		
		sc.close();
	}
	static int combi(int n, int m) {
		if (dp[n][m] > m) {
			return dp[n][m];
		}
		if (n == m || m == 0) {
			return dp[n][m] = 1;
		}
		return dp[n][m] = combi(n - 1, m - 1) + combi(n - 1, m);
	}
}
