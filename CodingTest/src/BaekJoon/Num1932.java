package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1932 {
	static int[][] arr;
	static Integer[][] ch;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		ch = new Integer[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			ch[n - 1][i] = arr[n - 1][i]; 
		}
		
		System.out.println(find(0, 0));
		
		br.close();
	}
	static int find(int dp, int idx) {
		if (dp == n - 1) {
			return ch[dp][idx];
		}
		
		if (ch[dp][idx] == null) {
			ch[dp][idx] = Math.max(find(dp + 1, idx), find(dp + 1, idx + 1)) + arr[dp][idx];
		}
		return ch[dp][idx];
	}
}
