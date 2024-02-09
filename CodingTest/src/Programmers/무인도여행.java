package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 무인도여행 {
	static int[] dx = {-1, 0, 1, 0}; 
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visit;
    static char[][] map;
    static int cnt = 0;
    public int[] solution(String[] maps) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        map = new char[maps.length][maps[0].length()];
        visit = new boolean[maps.length][maps[0].length()];
        
        for (int i = 0; i < maps.length; i++) {
            map[i] = maps[i].toCharArray();
        }
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 'X' && !visit[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    answer.add(cnt);
                } 
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
    static void dfs(int x, int y) {
        cnt += Character.getNumericValue(map[x][y]);
        visit[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < map.length && ny < map[0].length && !visit[nx][ny] && map[nx][ny] != 'X') {
                dfs(nx, ny);
            }
        }
    }
}
