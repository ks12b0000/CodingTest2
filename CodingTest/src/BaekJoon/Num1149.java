package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1149 {
	static int[][] arr;
	static int[][] ch;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][3];
		ch = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		ch[0][0] = arr[0][0];
		ch[0][1] = arr[0][1];
		ch[0][2] = arr[0][2];
		
		System.out.println(Math.min(paint(n - 1, 0), Math.min(paint(n - 1, 1), (paint(n - 1, 2)))));
		
		br.close();
	}
	static int paint(int n, int m) {
		if (ch[n][m] == 0) {
			if (m == 0) {
				ch[n][0] = Math.min(paint(n - 1, 1), paint(n - 1, 2)) + arr[n][0]; 
			}
			else if (m == 1) {
				ch[n][1] = Math.min(paint(n - 1, 2), paint(n - 1, 0)) + arr[n][1];
			}
			else {
				ch[n][2] = Math.min(paint(n - 1, 1), paint(n - 1, 0)) + arr[n][2];
			}
		}
		return ch[n][m];
	}
}
