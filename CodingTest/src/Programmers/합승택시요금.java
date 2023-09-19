package Programmers;

public class 합승택시요금 {
	// 플로이드워셜 알고리즘 공부하기...
	static int max = 98765432;
	public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = max;
        
        int[][] arr = new int[n + 1][n + 1];
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
        		if (i == j) {
        			arr[i][j] = 0;
        		}
        		else {
        			arr[i][j] = max;
        		}
        	}
        }
        
        for (int[] fare : fares) {
        	arr[fare[0]][fare[1]] = fare[2];
        	arr[fare[1]][fare[0]] = fare[2];
        }
        
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= n; j++) {
        		for (int k = 1; k <= n; k++) {
        			arr[j][k] = Math.min(arr[j][k], arr[j][i] + arr[i][k]);
        		}
        	}
        }
        
        for (int i = 1; i <= n; i++) {
        	answer = Math.min(answer, arr[s][i] + arr[i][a] + arr[i][b]);
        }
        
        return answer;
    }
}
