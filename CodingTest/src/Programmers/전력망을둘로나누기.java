package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 전력망을둘로나누기 {
	static int[][] arr;
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        arr = new int[n + 1][n + 1];
        
        for (int[] num : wires) {
            int x = num[0];
            int y = num[1];
            
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        
        for (int[] num : wires) {
            int x = num[0];
            int y = num[1];
            boolean[] ch = new boolean[n + 1];
            
            arr[x][y] = 0;
            arr[y][x] = 0;
            
            answer = Math.min(answer, BFS(n, x));
            
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        
        return answer;
    }
    static int BFS(int n, int x) {
        boolean[] ch = new boolean[n + 1];
        int cnt = 1;
        
        Queue<Integer> q = new LinkedList<>();
        ch[x] = true;
        q.add(x);
        
        while (!q.isEmpty()) {
            int tmp = q.poll();
            
            for (int i = 1; i <= n; i++) {
                if (arr[tmp][i] == 1 && !ch[i]) {
                    ch[i] = true;
                    q.add(i);
                    cnt++;
                }
            }
        }
        
        return Math.abs(cnt - (n - cnt));
    }
}
