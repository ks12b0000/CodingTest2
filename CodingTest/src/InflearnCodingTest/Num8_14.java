package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point4 {
	int x, y;
	public Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Num8_14 {
	static int answer = 0, n;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; 
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; 
	public void BFS(int x, int y, int[][] board) {
		Queue<Point4> queue = new LinkedList<>();		
		queue.offer(new Point4(x, y));	
		while (!queue.isEmpty()) {
			Point4 tmp = queue.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					queue.offer(new Point4(nx, ny));
				}
			}
		}
	}
	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}
	}
	public static void main(String[] args) {
		Num8_14 T = new Num8_14();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		T.solution(board);
		System.out.println(answer);
		sc.close();
	}
}
