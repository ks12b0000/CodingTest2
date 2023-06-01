package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num7569 {
	static int[][][] arr; 
	static int m, n, h;
	static int[] dx = {-1 , 0, 1, 0, 0, 0};
	static int[] dy = {0, 1, 0, -1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	static Queue<int[]> queue = new LinkedList<int[]>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		h = sc.nextInt();
		
		arr = new int[h][n][m];
		
		for (int i = 0; i < h; i++) { 
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					arr[i][j][k] = sc.nextInt();
					if (arr[i][j][k] == 1) {
						queue.add(new int[] {i, j, k});
					}
				}
			}
		}
				
		System.out.println(BFS());
		sc.close();
	}
	static int BFS() {
		while (!queue.isEmpty()) {
			int tmp[] = queue.poll();
			
			for (int i = 0; i < 6; i++) {
				int nx = tmp[1] + dx[i];
				int ny = tmp[2] + dy[i];
				int nz = tmp[0] + dz[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && nz >= 0 && nz < h && arr[nz][nx][ny] == 0) {
					arr[nz][nx][ny] = arr[tmp[0]][tmp[1]][tmp[2]] + 1;
					queue.add(new int[] {nz, nx, ny});
				}
			}
		}
		int max = 0;
		
		if (check()) {
			return -1;
		}
		else {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < m; k++) {
						max = Math.max(max, arr[i][j][k]);
					}
				}
			}
			return max - 1;
		}
	}
	static boolean check() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (arr[i][j][k] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
