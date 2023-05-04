package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        BFS(maps, visited);
        
        answer = visited[maps.length - 1][maps[0].length - 1];
        
        if (answer == 0) {
        	return -1;
        }
        
        return answer;
    }
	static void BFS(int[][] maps, int[][] visited) {
		int x = 0;
		int y = 0;
		visited[x][y] = 1;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		
		while (!queue.isEmpty()) {
			int[] n = queue.poll();
			int cx = n[0];
			int cy = n[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1) {
					continue;
				}
				if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
					visited[nx][ny] = visited[cx][cy] + 1;
                    queue.add(new int[]{nx, ny});
				}
			}
		}
	}
}
