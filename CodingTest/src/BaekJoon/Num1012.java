package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1012 {
	static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			int answer = 0;
			int[][] maps = new int[M][N];
			
			for (int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				maps[x][y] = 1;
			}
			
			for (int k = 0; k < maps.length; k++) {
				for (int q = 0; q < maps[k].length; q++) {
					if (maps[k][q] == 1) {
						answer++;
//						DFS(k, q, maps);
						BFS(k, q, maps);
					}
				}
			}
			System.out.println(answer);
		}
				
		
		sc.close();
	}
//	static void DFS(int x, int y, int[][] maps) {		
//		maps[x][y] = 0;
//		
//		for (int i = 0; i < 4; i++) {
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			
//			if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length &&  maps[nx][ny] == 1) {
//				DFS(nx, ny, maps);
//			}
//		}
//	}
	static void BFS(int x, int y, int[][] maps) {
		maps[x][y] = 0;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x,y});
		
		while (!queue.isEmpty()) {
			int[] q = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = q[0] + dx[i];
				int ny = q[1] + dy[i];
				
				if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length &&  maps[nx][ny] == 1) {
					maps[nx][ny] = 0;
					queue.offer(new int[] {nx, ny});
				}
			}
		}
	}
}
