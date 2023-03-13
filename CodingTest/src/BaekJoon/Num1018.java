package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1018 {
	static char chess[][];
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		chess = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				chess[i][j] = s.charAt(j);
			}
		}
		
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				ans = Math.min(ans, solution(i, j));
			}
		}
		System.out.println(ans);
		
		br.close();
	}
	
	public static int solution(int x, int y) {
		int B = 0; 
		int W = 0; 
		
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if ((i + j) % 2 == 0) {
					if (chess[i][j] == 'B') W++;
					else B++;
				}
				else { 
					if (chess[i][j] == 'W') W++;
					else B++;
				}
			}
		}
		return Math.min(B, W);
	}
}
