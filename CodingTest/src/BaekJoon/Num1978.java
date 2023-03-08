package BaekJoon;

import java.util.Scanner;

public class Num1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int cn = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			int m = sc.nextInt();
			for (int j = 1; j <= m; j++) {
				if (m % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				cn++;
			}
		}
		System.out.println(cn);
		sc.close();
	}
}
