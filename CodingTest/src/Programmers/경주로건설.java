package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 경주로건설 {
	static int[][][] dp;
    static int min = Integer.MAX_VALUE;
    static int len;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int solution(int[][] board) {
        int answer = 0;
        len = board.length;
        
        dp = new int[len][len][4]; // 4방향 중 작은 값을 고려하기 위해 3차원 배열
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < 4; k++) { // 모든 값을 일단 최대 값으로 설정
                    dp[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
        
        // 처음 시작지점 4방향은 0으로 설정
        dp[0][0][0] = 0;
        dp[0][0][1] = 0;
        dp[0][0][2] = 0;
        dp[0][0][3] = 0;
        
        BFS(0, 0, board);
        
        answer = min;
        
        return answer;
    }
    static void BFS(int x, int y, int[][] board) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y, 0});
        
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            
            x = arr[0];
            y = arr[1];
            int qDir = arr[2];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= len || ny < 0 || ny >= len || board[nx][ny] == 1) {
                    continue;
                }
                
                int price = dp[x][y][qDir];
                if (x == 0 && y == 0 || i == qDir) { // 직선일 경우
                    price += 100;
                }
                else { // 회전일 경우
                    price += 600;
                }
                
                if (dp[nx][ny][i] >= price) { // 현재 위치값이 price보다 크면 더 작은값인 price로 변경
                    dp[nx][ny][i] = price;
                    queue.add(new int[] {nx, ny, i});
                    
                    if (nx == len - 1 && ny == len - 1) { // 마지막 지점에 도착했을 때 최소 price값으로 변경
                        min = Math.min(min, price);
                    }
                }
            }
        }
    }
}
