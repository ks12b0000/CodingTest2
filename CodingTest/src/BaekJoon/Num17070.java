package BaekJoon;

import java.util.Scanner;

public class Num17070 {
	static int[][] map;
	static int answer = 0;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n + 1][n + 1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		DFS(1, 2, 0);
		
		System.out.println(answer);
		sc.close();
	}
	static void DFS(int x, int y, int idx) {
		if (x == n && y == n) {
			answer++;
			return;
		}
		
		if (idx == 0) { // 파이프가 가로일 떄 
			if (y + 1 <= n && map[x][y + 1] == 0) { // 동쪽
				DFS(x, y + 1, 0);
			}
		}
		else if (idx == 1) { // 파이프가 세로일 때
			if (x + 1 <= n && map[x + 1][y] == 0) { // 남쪽
				DFS(x + 1, y, 1);
			}
		}
		else if (idx == 2) { // 파이프가 대각선일 때
			if (y + 1 <= n && map[x][y + 1] == 0) { // 동쪽
				DFS(x, y + 1, 0);
			}
			
			if (x + 1 <= n && map[x + 1][y] == 0) { // 남쪽
				DFS(x + 1, y, 1);
			}
		}
		
		// 위 3방향이 대각선 가능한지 검사
		if (x + 1 <= n && y + 1 <= n && map[x + 1][y] == 0 && map[x][y + 1] == 0 && map[x + 1][y + 1] == 0) {
			DFS(x + 1, y + 1, 2);
		}
	}
}
