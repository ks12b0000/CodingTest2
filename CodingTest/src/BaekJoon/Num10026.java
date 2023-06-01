package BaekJoon;

import java.util.Scanner;

public class Num10026 {
	static char[][] arr;
	static boolean[][] ch;
	static int n;
	static int[] dx = {-1 , 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new char[n][n];
		ch = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().toCharArray();
		}
		
		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!ch[i][j]) {
					DFS(i, j);
					cnt1++;
				}
			}
		}
		
		ch = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!ch[i][j]) {
					DFS(i, j);
					cnt2++;
				}
			}
		}
		
		System.out.println(cnt1 + " " + cnt2);
		
		sc.close();
	}
	static void DFS(int x, int y) {
		ch[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && !ch[nx][ny] && arr[x][y] == arr[nx][ny]) {
				DFS(nx, ny);
			}
		}
	}
}
