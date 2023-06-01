package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num11725 {
	static int n;
	static int[] parent;
	static boolean[] ch;
	static ArrayList<Integer> list[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ch = new boolean[n + 1];
		parent = new int[n + 1];
		list = new ArrayList[n + 1];
		
		for (int i = 0; i < n + 1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		DFS(1);
		
		for (int i = 2; i < parent.length; i++) {
			System.out.println(parent[i]);
		}
		
		sc.close();
	}
	static void DFS(int idx) {
		ch[idx] = true;
		for (int i : list[idx]) {
			if (!ch[i]) {
				parent[i] = idx;
				DFS(i);
			}
		}
	}
}
