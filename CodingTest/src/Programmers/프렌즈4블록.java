package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 프렌즈4블록 {
	static boolean[][] ch;
	public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] copy = new char[m][n];
        
        for (int i = 0; i < m; i++) {
        	copy[i] = board[i].toCharArray();
        }
              
        boolean flag = true;
        while (flag) {
        	ch = new boolean[m][n];       	
        	flag = false;
        	
        	for (int i = 0; i < m - 1; i++) {
        		for (int j = 0; j < n - 1; j++) {
        			if (copy[i][j] == '0') continue;
        			if (check(i, j, copy)) {
        				ch[i][j] = true;
        				ch[i + 1][j] = true;
        				ch[i][j + 1] = true;
        				ch[i + 1][j + 1] = true;
        				flag = true;
        			}
        		}
        	}
        	answer += swap(m, n, copy);
        }
        
        return answer;
    }
	static boolean check(int x, int y, char[][] copy) {
		char c = copy[x][y];
		if (c == copy[x][y + 1] && c == copy[x + 1][y] && c == copy[x + 1][y + 1]) {
			return true;
		}
		return false;
	}
	static int swap(int m, int n, char[][] copy) {
		int cnt = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (ch[i][j]) {
					copy[i][j] = '.';
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			Queue<Character> queue = new LinkedList<Character>();
			for (int j = m - 1; j >= 0; j--) {
				if (copy[j][i] == '.') {
					cnt++;
				}
				else {
					queue.add(copy[j][i]);
				}
			}
			int idx = m - 1;
			
			while (!queue.isEmpty()) {
				copy[idx--][i] = queue.poll();
			}
			
			for (int j = idx; j >= 0; j--) {
				copy[j][i] = '0';
			}
		}
		return cnt;
	}
}
