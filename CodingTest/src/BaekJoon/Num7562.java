package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num7562 {
	static int l, x1, y1, x2, y2;
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
	static int[][] arr;
	static boolean[][] ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			arr = new int[l][l];
			ch = new boolean[l][l];
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			BFS(x1, y1);
			System.out.println(arr[x2][y2]);
		}
		
		sc.close();
	}
	static void BFS(int x, int y) {
		ch[x][y] = true;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			
			for (int i = 0; i < 8; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];
				
				if (nx >= 0 && nx < l && ny >= 0 && ny < l && !ch[nx][ny] && arr[nx][ny] == 0) {
					ch[nx][ny] = true;
					arr[nx][ny] = arr[tmp[0]][tmp[1]] + 1;
					queue.add(new int[] {nx, ny});
				}
			}
		}
	}
}
