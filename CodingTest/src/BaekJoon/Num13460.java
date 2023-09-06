package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num13460 {
	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, -1, 1, 0};
	static int redX, redY, blueX, blueY;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] arr = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
				if (arr[i][j] == 'R') {
					redX = i;
					redY = j;
				}
				else if (arr[i][j] == 'B') {
					blueX = i;
					blueY = j;
				}
			}
		}
				
		DFS(arr);
		System.out.println(cnt);
		
		br.close();
	}
	static void DFS(char[][] arr) {
		for (int i = 0; i < 4; i++) {
			cnt++;
			
			while (true) {
				int nx = redX + dx[i];
				int ny = redY + dy[i];
				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length) {
					if (arr[nx][ny] == 'O') break;
					else if (arr[nx][ny] == '#') {
						cnt = 0;
						break;
					}
					redX = nx;
					redY = ny;
				}
			}
			
		}
	}
}
