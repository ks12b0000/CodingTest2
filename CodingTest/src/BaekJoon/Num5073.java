package BaekJoon;

import java.util.Scanner;

public class Num5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			
			int max = Math.max(a, Math.max(b, c));
			
			
			if (max == a) {
				if (max >= b + c) {
					System.out.println("Invalid");
					continue;
				}
			}
			else if (max == b) {
				if (max >= a + c) {
					System.out.println("Invalid");
					continue;
				}
			}
			else if (max == c) {
				if (max >= a + b) {
					System.out.println("Invalid");
					continue;
				}
			}			
			
			if (a == b && b == c) {
				System.out.println("Equilateral");
			}
			else if (a == b || b == c || a == c) {
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalene");
			}
		}
		
		sc.close();
	}
}
