package Programmers;

public class 쿼드압축후개수세기 {
	static int zero, one = 0;
	public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        DFS(0, 0, arr.length, arr);
        
        answer[0] = zero;
        answer[1] = one;
        
        return answer;
    }
	static void DFS(int y, int x, int size, int[][] arr) {
		if (check(y, x, size, arr)) {
			if (arr[y][x] == 0) {
				zero++;
			}
			else {
				one++;
			}
			return;
		}
		
		int nSize = size / 2;
		
		// 4등분
		DFS(y, x, nSize, arr);
		DFS(y, x + nSize, nSize, arr);
		DFS(y + nSize, x, nSize, arr);
		DFS(y + nSize, x + nSize, nSize, arr);
	}
	static boolean check(int y, int x, int size, int[][] arr) {
		for (int i = y; i < y + size; i++) {
			for (int j = x; j < x + size; j++) {
				if (arr[i][j] != arr[y][x]) {
					return false;
				}
			}
		}
		return true;
	}
}
