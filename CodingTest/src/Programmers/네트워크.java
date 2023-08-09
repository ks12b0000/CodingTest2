package Programmers;

public class 네트워크 {
	static boolean[] ch;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        ch = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!ch[i]) {
                answer++;
                DFS(i, computers);
            }
        }
        
        return answer;
    }
    void DFS(int i, int[][] computers) {
        ch[i] = true;
        
        for (int j = 0; j < computers.length; j++) {
            if (!ch[j] && computers[i][j] == 1) {
                DFS(j, computers);
            }
        }
    }
}
