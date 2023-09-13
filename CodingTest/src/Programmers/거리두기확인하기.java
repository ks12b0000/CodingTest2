package Programmers;

public class 거리두기확인하기 {
	static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visit;
    static int[] answer = {1, 1, 1, 1, 1};
    public int[] solution(String[][] places) {           
        for (int i = 0; i < places.length; i++) {
            visit = new boolean[5][5];
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (places[i][j].charAt(k) == 'P'){
                        visit[j][k] = true;
                        DFS(i, j, k, places[i], 0);
                        visit[j][k] = false;
                    }
                }
            }
        }
        
        return answer;
    }
    static void DFS(int idx, int x, int y, String[] places, int cnt) {
    	if (cnt > 2) return;
    	if (cnt > 0 && cnt <= 2 && places[x].charAt(y) == 'P') {
    		answer[idx] = 0;
    		return;
    	}
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx <= 4 && ny >= 0 && ny <= 4 && places[nx].charAt(ny) != 'X' && !visit[nx][ny]) {
                visit[nx][ny] = true;
                DFS(idx, nx, ny, places, cnt + 1);
                visit[nx][ny] = false;
            }
        }
    }
}
