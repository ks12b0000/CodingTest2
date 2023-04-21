package Programmers;

public class 방문길이 {
	public int solution(String dirs) {
        int answer = 0;
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        boolean[][][] check = new boolean[11][11][4];        
        int x = 5;
        int y = 5;
        
        for (int i = 0; i < dirs.length(); i++) {
        	int dir = 0;
        	
    		if (dirs.charAt(i) == 'L') {
    			dir = 0;
        	}
        	else if (dirs.charAt(i) == 'U') {
        		dir = 1;      		
        	}
        	else if (dirs.charAt(i) == 'D') {
        		dir = 2;
        	}
        	else if (dirs.charAt(i) == 'R') {
        		dir = 3;
        	}
        	
    		int ny = y + dy[dir];
        	int nx = x + dx[dir];
    		
    		if (nx < 0 || nx >= 11 || ny < 0 || ny >= 11) {
    			continue;
    		}
    		
    		if (!check[ny][nx][3 - dir] && !check[y][x][dir]) {
    			answer++;
    			check[ny][nx][3 - dir] = true;
    			check[y][x][dir] = true;
    		}
    		
    		y = ny;
    		x = nx;
        }
        
        return answer;
    }
}
