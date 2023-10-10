package BaekJoon;

import java.util.Scanner;

public class Num1182 {
	static int n, s;
	static int answer = 0;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		s = sc.nextInt();
		
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		DFS(0, 0);
		
		if (s == 0) System.out.println(answer - 1);
		else System.out.println(answer);
		
		sc.close();
	}
	static void DFS(int dept, int sum) {
		if (dept == n) {
			if (sum == s) answer++;
			return;
		}
		DFS(dept + 1, sum + arr[dept]);
		DFS(dept + 1, sum);
	}
}
