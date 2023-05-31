package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num14502 {
	static int[][] map;
	static int[][] copyMap;
	static int n, m;
	static int max = Integer.MIN_VALUE;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		DFS(0);
		
		System.out.println(max);
		
		sc.close();
	}
	static void DFS(int wall) {
		if (wall == 3) {
			BFS();
			return;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					DFS(wall + 1);
					map[i][j] = 0;
				}
			}
		}
	}
	static void BFS() {
		Queue<int[]> queue = new LinkedList<int[]>();
		
		copyMap = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				copyMap[i][j] = map[i][j];
				if (copyMap[i][j] == 2) {
					queue.add(new int[] {i, j});
				}
			}
		}
		
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && copyMap[nx][ny] == 0) {
					copyMap[nx][ny] = 2;
					queue.add(new int[] {nx, ny});
				}
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (copyMap[i][j] == 0) {
					cnt++;
				}
			}
		}
		max = Math.max(cnt, max);
	}
}
