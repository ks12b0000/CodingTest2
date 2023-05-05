package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의최단거리통로 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		board = new int[8][8];
		dis = new int[8][8];
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				board[i][j] = sc.nextInt(); 
			}
		}
		
		BFS(1, 1);
		
		if (dis[7][7] == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(dis[7][7]);
		}
		
		sc.close();
	}
	static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x, y});
		board[x][y] = 1;
		
		while (!queue.isEmpty()) {
			int[] n = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				
				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					queue.offer(new int[] {nx, ny});
					dis[nx][ny] = dis[n[0]][n[1]] + 1;
				}
			}			
		}				
	}
}
