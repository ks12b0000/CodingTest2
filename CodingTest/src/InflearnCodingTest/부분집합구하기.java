package InflearnCodingTest;

import java.util.Scanner;

public class 부분집합구하기 {
	static boolean[] ch;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ch = new boolean[n + 1];
		DFS(1);
		
		sc.close();
	}
	static void DFS(int L) {
		
		if (L == n + 1) {
			String answer = "";
			for (int i = 1; i <= n; i++) {
				if (ch[i]) {
					answer += i + " ";
				}
			}
			if (answer.length() > 0) {
				System.out.println(answer);
			}
		}
		else {
			ch[L] = true;
			DFS(L + 1);
			ch[L] = false;
			DFS(L + 1);
		}
	}
}
