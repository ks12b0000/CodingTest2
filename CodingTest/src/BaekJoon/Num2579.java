package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2579 {
	static Integer[] ch;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ch = new Integer[n + 1];
		arr = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		ch[0] = arr[0];
		ch[1] = arr[1];
		
		if (n >= 2) {
			ch[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
		
		br.close();
	}
	static int find(int n) {
		if (ch[n] == null) {
			ch[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n];
		}
		return ch[n];
	}
}
