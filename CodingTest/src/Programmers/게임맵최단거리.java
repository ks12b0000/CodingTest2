package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1}; 
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] ch = new int[maps.length][maps[0].length];
        
        BFS(maps, ch);
        
        answer = ch[maps.length - 1][maps[0].length - 1];
        
        if (answer == 0) return -1;
        
        return answer;
    }
    void BFS(int[][] maps, int[][] ch) {
        int x = 0;
        int y = 0;      
        ch[x][y] = 1;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        
        while (!q.isEmpty()) {
            int[] num = q.poll();
            int cx = num[0];
            int cy = num[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length 
                		&& ch[nx][ny] == 0 && maps[nx][ny] == 1) {                  
                    ch[nx][ny] = ch[cx][cy] + 1;
                    q.add(new int[]{nx, ny});                                            
                }
            }
        }
    }
}
