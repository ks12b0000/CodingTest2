package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Num1929 {
	// 방법 1
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		StringBuilder sb = new StringBuilder();
//		for (int i = n; i <= m; i++) {
//			BigInteger a = new BigInteger(String.valueOf(i));
//			if (a.isProbablePrime(10)) { // 만약 입력값이 소수인지 아닌지 판별하는 것
//				sb.append(a + "\n");
//			}
//		}
//		System.out.println(sb);
//		
//		br.close();
//	}
	
	
	// 방법 2
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		prime = new boolean[m + 1];
		get_prime();
		StringBuilder sb = new StringBuilder();
		
		for (int i = n; i <= m; i++) {
			if (!prime[i]) {
				sb.append(i + "\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
	public static void get_prime() { // 에라토스테네스의 체 알고리즘
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
