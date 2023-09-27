package BaekJoon;

import java.util.Scanner;

public class Num14889 {
	static int n;
	static int[][] map;
	static boolean[] check;
	static int answer = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];
		check = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		DFS(0, 0);
		
		System.out.println(answer);
		
		sc.close();
	}
	static void DFS(int idx, int cnt) {
		if (cnt == n / 2) {
			diff();
			return;
		}
		
		for (int i = idx; i < n; i++) {
			if (!check[i]) {
				check[i] = true;
				DFS(i + 1, cnt + 1);
				check[i] = false;
			}
		}
	}
	static void diff() {
		int start = 0;
		int link = 0;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (check[i] && check[j]) {
					start += map[i][j];
					start += map[j][i];
				}
				else if (!check[i] && !check[j]) {
					link += map[i][j];
					link += map[j][i];
				}
			}
		}
		answer = Math.min(answer, Math.abs(start - link));
	}
}
