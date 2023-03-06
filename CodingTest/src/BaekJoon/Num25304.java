package BaekJoon;

import java.util.Scanner;

public class Num25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		String answer = "";
		for (int i = 0; i < B; i++) {
			int C = sc.nextInt();
			int D = sc.nextInt();
			sum += C * D;
		}
		if (sum == A) answer = "Yes";
		else answer = "No";
		
		System.out.println(answer);
		sc.close();
	}
}
