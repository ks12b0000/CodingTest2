package Programmers;

public class 등굣길 {
	public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] map = new int[m + 1][n + 1];
        
        for (int i = 0; i < puddles.length; i++) {
            map[puddles[i][0]][puddles[i][1]] = -1;
        }
        
        map[1][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] != -1) {
                    if (map[i - 1][j] != -1) {
                        map[i][j] += map[i - 1][j];
                    }
                    if (map[i][j - 1] != -1) {
                        map[i][j] += map[i][j - 1];
                    }
                    map[i][j] %= 1000000007;
                }
            }
        }
        
        answer = map[m][n];
        
        return answer;
    }
}
