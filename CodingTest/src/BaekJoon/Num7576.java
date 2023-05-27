package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num7576 {
	static int[][] arr; 
	static int m, n;
	static int[] dx = {-1 , 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Queue<int[]> queue = new LinkedList<int[]>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					queue.add(new int[] {i, j});
				}
			}
		}
		
		System.out.println(BFS());
		
		sc.close();
	}
	static int BFS() {		
		while (!queue.isEmpty()) {
			int[] xy = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = xy[0] + dx[i];
				int ny = xy[1] + dy[i];
				
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
					arr[nx][ny] = arr[xy[0]][xy[1]] + 1;
					queue.add(new int[] {nx, ny});
				}
			}
		}
		int max = 0;
		if (check()) {
			return -1;
		}
		else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					max = Math.max(max, arr[i][j]);
				}
			}
			return max - 1;
		}
	}
	static boolean check() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
 }
