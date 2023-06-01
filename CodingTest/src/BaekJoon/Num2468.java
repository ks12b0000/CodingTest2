package BaekJoon;

import java.util.Scanner;

public class Num2468 {
	static int[][] arr;
	static boolean[][] ch;
	static int n;
	static int[] dx = {-1 , 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n][n];		
		
		int maxH = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				maxH = Math.max(maxH, arr[i][j]);
			}
		}
		
		int max = 0;
		for (int height = 0; height <= maxH; height++) {
			ch = new boolean[n][n];
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!ch[i][j] && arr[i][j] > height) {
						DFS(i, j, height);
						cnt++;
					}
				}
			}
			max = Math.max(max, cnt);
		}		
				
		System.out.println(max);
		
		
		sc.close();
	}
	static void DFS(int x, int y, int height) {
		ch[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && !ch[nx][ny] && arr[nx][ny] > height) {
				DFS(nx, ny, height);
			}
		}
	}
}
