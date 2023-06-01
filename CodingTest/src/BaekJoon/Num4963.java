package BaekJoon;

import java.util.Scanner;

public class Num4963 {
	static int[][] arr;
	static boolean[][] ch;
	static int w, h;
	static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int cnt = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			
			if (w == 0 && h == 0) break;
			
			arr = new int[h][w];
			ch = new boolean[h][w];
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!ch[i][j] && arr[i][j] == 1) {
						DFS(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
	static void DFS(int x, int y) {
		ch[x][y] = true;
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < h && ny >= 0 && ny < w && !ch[nx][ny] && arr[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}
	}
}
