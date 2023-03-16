package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num9663 {
	public static int[] arr;
	public static int N;
	public static int cnt = 0;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		nQueen(0);
		System.out.println(cnt);
		
		br.close();
	}
	public static void nQueen(int depth) {
		if (N == depth) {
			cnt++;
			return;
		}
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (check(depth)) {
				nQueen(depth + 1);
			}
		}
	}
	public static boolean check(int ch) {
		for (int i = 0; i < ch; i++) {
			if (arr[ch] == arr[i]) {
				return false;
			}
			else if (Math.abs(ch - i) == Math.abs(arr[ch] - arr[i])) {
				return false;
			}
		}
		return true;
	}
}
