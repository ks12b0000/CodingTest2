package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(find(n, 0));
		
		br.close();
	}
	static int find(int n, int cnt) {
		if (n < 2) return cnt;
		return Math.min(find(n / 2, cnt + 1 + (n % 2)), find(n / 3, cnt + 1 + (n % 3)));
	}
}
