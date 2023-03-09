package BaekJoon;

import java.util.Scanner;

public class Num24266 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n * n * n);
		System.out.println(3);
		sc.close();
	}
}
/*
for문이 3번 돈다
O(n^3)만큼의 시간 복잡도를 가진다.
차수는 3
 */

