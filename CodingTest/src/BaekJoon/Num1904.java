package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1904 {
	static int[] arr = new int[1000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		System.out.println(title(n));
		
		br.close();
	}
	static int title(int n) {
		if (arr[n] == -1) {
			arr[n] = (title(n - 1) + title(n - 2)) % 15746;
		}
		return arr[n];
	}
}
