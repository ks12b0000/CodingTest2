package BaekJoon;

import java.util.Scanner;

public class Num24267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n * (n - 1) * (n - 2) / 6);
		System.out.println(3);
		sc.close();
	}
}
/*
반복문의 범위는 n, n-1, n-2이다.
여기서 6으로 나누면 원하는 값을 얻을 수 있다.
O(n^3)다. 차수는 3
 */

