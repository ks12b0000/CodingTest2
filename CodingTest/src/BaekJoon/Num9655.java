package BaekJoon;

import java.util.Scanner;

public class Num9655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(N % 2 == 1 ? "SK" : "CY");
		
		sc.close();
	}
}
