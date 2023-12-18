package BaekJoon;
import java.util.*;

public class Test1 {
	static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static char[][] ch;
    static int[][] dis;
    static int minLever, minEnd;
    static int startX, startY, leverX, leverY, endX, endY;
    static boolean[][] check;
	public int solution(String[] maps) {
        int answer = 0;
        
        ch = new char[maps.length][maps[0].length()];
        check = new boolean[maps.length][maps[0].length()];
        dis = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            ch[i] = maps[i].toCharArray();
            if (maps[i].contains("S")) {
            	startX = i;
            	startY = maps[i].indexOf("S");
            } 
            if (maps[i].contains("L")) {
            	leverX = i;
            	leverY = maps[i].indexOf("L");
            }
            if (maps[i].contains("E")) {
            	endX = i;
            	endY = maps[i].indexOf("E");
            }
        }        
        
        BFS(startX, startY);
        minLever = dis[leverX][leverY];
        check = new boolean[maps.length][maps[0].length()];
        dis = new int[maps.length][maps[0].length()];
        BFS2(leverX, leverY);
        minEnd = dis[endX][endY];
        
        System.out.println("lever = " + minLever);
        System.out.println("end = " + minEnd);
        if (minLever == 0 || minEnd == 0) {
            return -1;
        }
        
        answer = minLever + minEnd;
        
        return answer;
    }
    static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x, y});
        check[x][y] = true;
        
        while (!queue.isEmpty()) {
			int[] n = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				
				if (nx >= 0 && nx < ch.length && ny >= 0 && ny < ch[0].length && check[nx][ny] == false && ch[nx][ny] == 'O') {
					check[nx][ny] = true;
					queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[n[0]][n[1]] + 1;
				}
			}			
		}	
    }
    static void BFS2(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x, y});
        check[x][y] = true;
        
        while (!queue.isEmpty()) {
			int[] n = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				
				if (nx >= 0 && nx < ch.length && ny >= 0 && ny < ch[0].length && check[nx][ny] == false && ch[nx][ny] == 'O') {
					check[nx][ny] = true;
					queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[n[0]][n[1]] + 1;
				} 
                
			}			
		}	
    }
}
