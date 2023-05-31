package BaekJoon;

import java.util.Scanner;

public class Num12865 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] arr = new int[n + 1][2];
		int[][] dp = new int[n + 1][k + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (j - arr[i][0] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], arr[i][1] + dp[i - 1][j - arr[i][0]]);
				}
				else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		System.out.println(dp[n][k]);
		
		sc.close();
	}
}
