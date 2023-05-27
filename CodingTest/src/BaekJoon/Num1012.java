package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1012 {
	static int m, n, k;
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			arr = new int[n][m];
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					arr[j][k] = 0;
				}
			}
			
			for (int j = 0; j < k; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				arr[b][a] = 1;
			}
			
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (arr[j][k] == 1) {
						BFS(j, k);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
//	static void DFS(int x, int y) {
//		arr[x][y] = 0;
//		
//		for (int i = 0; i < 4; i++) {
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			
//			if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
//				DFS(nx, ny);
//			}
//		}
//	}
	static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		arr[x][y] = 0;
		
		while (!queue.isEmpty()) {
			int[] xy = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = xy[0] + dx[i];
				int ny = xy[1] + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					queue.add(new int[] {nx, ny});
				}
			}
		}
 	}
}
