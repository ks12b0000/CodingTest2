package BaekJoon;

import java.util.Scanner;

public class Num2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		boolean[][] ch = new boolean[100][100];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!ch[j][k]) {
						answer++;
						ch[j][k] = true;
					}
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}