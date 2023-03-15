package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num17103 {
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			int a = Integer.parseInt(br.readLine());
			prime = new boolean[a + 1]; 
			get_prime();
			
			for (int j = 2; j <= a / 2; j++) {
				if (!prime[j] && !prime[a - j])
					cnt++;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
			
		br.close();
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
			
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		
		}
	}
}
