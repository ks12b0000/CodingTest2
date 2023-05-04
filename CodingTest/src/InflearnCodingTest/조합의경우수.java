package InflearnCodingTest;

import java.util.Scanner;

public class 조합의경우수 {
	static int[][] ch = new int[34][34];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(DFS(n, r));
		
		sc.close();
	}	
	static int DFS(int n, int r) {
		if (ch[n][r] > 0) {
			return ch[n][r];
		}
		if (n == r || r == 0) {
			return 1;
		}
		else {
			return ch[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
		}
	}
}
