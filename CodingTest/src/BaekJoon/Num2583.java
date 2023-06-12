package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num2583 {
	static int m, n;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr;
	static int cnt;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		int k = sc.nextInt();
		
		arr = new int[m][n];
		
		for (int i = 0; i < k; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for (int j = y1; j < y2; j++) {
				for (int q = x1; q < x2; q++) {
					arr[j][q] = 1;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					cnt = 0;
					DFS(i, j);
					list.add(cnt);
				}
			}
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		sc.close();
	}
	static void DFS(int x, int y) {
		arr[x][y] = 1;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 0) {
				DFS(nx, ny);
			}
		}
	}
}
