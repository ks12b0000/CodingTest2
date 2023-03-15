package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4948 {
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) break;
			int cnt = 0;
			prime = new boolean[a * 2 + 1];
			get_prime();
			for (int i = a + 1; i <= a * 2; i++) {
				if (!prime[i]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
	public static void get_prime() {
		prime[0] = true;
		if (prime.length > 2) {
			prime[1] = true;
			for (int i = 2; i < Math.sqrt(prime.length); i++) {
				if (prime[i]) continue;
				for (int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
	}
}
