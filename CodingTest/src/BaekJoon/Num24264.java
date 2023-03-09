package BaekJoon;

import java.util.Scanner;

public class Num24264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n * n);
		System.out.println(2);
		sc.close();
	}
}
/*
이중 for문의 경우 n*n만큼의 시간이 소요된다
O(n^2)만큼의 시간 복잡도를 가짐.
차수는 2

그런데 이 문제를 풀 때 int로 변수를 받으면 오버플로우가 나서 틀렸다고 나온다.
int는 -2,147,483,648 ~ 2,147,483,647 범위의 수를 표현할 수 있는데
문제에서 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다 라고 했으므로
46341 * 46341 을 하면 이 범위를 넘어선다.
그래서 Long형으로 받아 줘야 한다.
 */

