package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num2178 {
	static int n, m;
	static int[][] arr;
	static boolean[][] ch;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][m];
		ch = new boolean[n][m];
		ch[0][0] = true;
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		BFS(0, 0);
		System.out.println(arr[n - 1][m - 1]);
		
		sc.close();
	}
	static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int[] a = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = dx[i] + a[0];
				int ny = dy[i] + a[1];
				
				if (nx < 0 || nx >= n || ny < 0 || ny >= m || ch[nx][ny] || arr[nx][ny] == 0) {
					continue;
				}
				
				queue.add(new int[] {nx, ny});
				ch[nx][ny] = true;
				arr[nx][ny] = arr[a[0]][a[1]] + 1;
			}
		}
	}
}
