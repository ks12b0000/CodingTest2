package BaekJoon;

import java.util.Scanner;

public class Num11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int b = sc.nextInt();
		
		System.out.println(Long.toString(n, b).toUpperCase());
		
		sc.close();
	}
}
