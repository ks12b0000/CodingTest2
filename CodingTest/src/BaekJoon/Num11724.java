package BaekJoon;

import java.util.Scanner;

public class Num11724 {
	static int n, m;
	static int[][] arr = new int[1001][1001];
	static boolean[] ch = new boolean[1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = arr[b][a] = 1; 
		}
		
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			if (!ch[i]) {
				DFS(i);
				answer++;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
	static void DFS(int i) {
		if (ch[i]) {
			return;
		}
		else {
			ch[i] = true;
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] == 1) {
					DFS(j);
				}
			}
		}
	}
}
