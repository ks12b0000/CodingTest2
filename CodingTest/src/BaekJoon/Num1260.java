package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1260 {
	static int n, m, start;
	static int[][] arr;
	static boolean[] ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		arr = new int[n + 1][n + 1];
		ch = new boolean[n + 1];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		DFS(start);
		System.out.println();
		ch = new boolean[n + 1];
		BFS(start);
		
		sc.close();
	}
	static void DFS(int start) {
		ch[start] = true;
		
		System.out.print(start + " ");
		
		for (int i = 0; i <= n; i++) {
			if (!ch[i] && arr[start][i] == 1) {
				DFS(i);
			}
		}
	}
	static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		ch[start] = true;
		
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for (int i = 0; i <= n; i++) {
				if (!ch[i] && arr[start][i] == 1) {
					queue.add(i);
					ch[i] = true;
				}
			}
		}
	}
}
