package BaekJoon;

import java.util.Scanner;

public class Num2606 {
	static int n, m;
	static boolean[] ch;
	static int[][] arr;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n + 1][n + 1];
		ch = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = arr[b][a] = 1; 
		}
		
		DFS(1);
		System.out.println(cnt);
		
		sc.close();
	}
	static void DFS(int start) {
		ch[start] = true;
		
		for (int i = 1; i <= n; i++) {
			if (!ch[i] && arr[start][i] == 1) {
				cnt++;
				DFS(i);
			}
		}
	}
}
