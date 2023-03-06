package BaekJoon;

import java.util.Scanner;

public class Num25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = A / 4;
		String answer = "";
		for (int i = 0; i < B; i++) {
			answer += "long ";
		}
		System.out.println(answer + "int");
		
		sc.close();
	}
}
