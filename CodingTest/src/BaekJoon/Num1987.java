package BaekJoon;

import java.util.Scanner;

public class Num1987 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr;
	static boolean[] ch = new boolean[26];
	static int r, c;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		arr = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			String a = sc.next();
			for (int j = 0; j < c; j++) {
				arr[i][j] = a.charAt(j) - 'A';
			}
		}
		
		DFS(0, 0, 1);
		
		System.out.println(cnt);
		
		sc.close();
	}
	static void DFS(int x, int y, int len) {
		ch[arr[x][y]] = true;
		cnt = Math.max(cnt, len);
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < r && ny >= 0 && ny < c && !ch[arr[nx][ny]]) {
				DFS(nx, ny, len + 1);
				ch[arr[nx][ny]] = false;
			}
		}
	}
}
