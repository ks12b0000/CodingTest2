package Programmers;

public class 미로탈출명령어 {
	static int[] dy = {0, -1, 1, 0};
    static int[] dx = {1, 0, 0, -1};
    static char[] dir = {'d', 'l', 'r', 'u'};
    static String str = "z";
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        String answer = "";
        
        int dist = Math.abs(x - r) + Math.abs(y - c);
        
        if ((k - dist) % 2 == 1 || k < dist) {
            return "impossible";
        }
        
        dfs(x, y, r, c, k, n, m, 0, "");
        
        answer = str;
        
        return answer;
    }
    static void dfs(int x, int y, int r, int c, int k, int n, int m, int cnt, String tmp) {
        if (k < cnt + Math.abs(x - r) + Math.abs(y - c)) {
            return;
        }
        
        if (x == r && y == c && cnt == k) {
            str = tmp;
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && tmp.compareTo(str) < 0) {
                dfs(nx, ny, r, c, k, n, m, cnt + 1, tmp + dir[i]);
            }
        }
    }
}
