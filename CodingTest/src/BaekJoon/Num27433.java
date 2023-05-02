package BaekJoon;

import java.util.Scanner;

public class Num27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(DFS(n));
		
		sc.close();
	}
	static long DFS(int n) {
		if (n < 2) return 1;
		else {
			return n * DFS(n - 1);
		}
	}
}
