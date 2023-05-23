package BaekJoon;

import java.util.Scanner;

public class Num11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] fibo = new int[1001];
		int n = sc.nextInt();
		
		fibo[0] = 1;
		fibo[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 10007;
		}
		
		System.out.println(fibo[n]);
		
		sc.close();
	}
}
