package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9461 {
	static Long[] arr = new Long[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr[0] = 0L;
		arr[1] = 1L;
		arr[2] = 1L;
		arr[3] = 1L;
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(title(a));
		}		
		
		br.close();
	}
	static long title(int a) {
		if (arr[a] == null) {
			arr[a] = title(a - 2) + title(a - 3);
		}
		return arr[a];
	}
}
