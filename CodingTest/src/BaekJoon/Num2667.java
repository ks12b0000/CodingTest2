package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num2667 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int sum, n;
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			for (int j = 0; j < n; j++) {
				arr[i][j] = a.charAt(j);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum = 0;
				if (arr[i][j] == '1') {
					DFS(i, j);
					list.add(sum);
					cnt++;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(cnt);
		for (int x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	static void DFS(int x, int y) {
		arr[x][y] = '0';
		sum++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == '1') {
				DFS(nx, ny);
			}
		}
 	}
}
