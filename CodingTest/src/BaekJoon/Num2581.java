package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<>();
		int sum = 0;
		for (int i = m; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;					
				}
			}
			if (cnt == 2) {
				answer.add(i);
				sum += i;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		}
		else System.out.print(sum + "\n" + answer.get(0));
		sc.close();
	}
}
