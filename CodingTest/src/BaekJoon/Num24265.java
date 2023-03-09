package BaekJoon;

import java.util.Scanner;

public class Num24265 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println((n * (n - 1)) / 2);
		System.out.println(2);
		sc.close();
	}
}
/*
i는 [1, n-1], j는 [i+1, n]번 돈다.
i가 n-1번 도는 동안 j는 순서대로 n-1, n-2, n-3, ... , 1번 돌게 된다.
따라서 n-1 + n-2 + ... + 1 이 답이 된다.
차가 1인 등차수열만큼 돌게 되므로 n*(n-1)/2 만큼 돈다
그래도 시간 복잡도는 똑같이 O(n^2)다. 차수는 2
 */

