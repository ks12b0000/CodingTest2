package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}
			else {
				return e1[1] - e2[1];
			}
		});

		int cnt = 1;
		int idx = 0;

		for (int i = 1; i < n; i++) {
			if (arr[idx][1] <= arr[i][0]) {
				cnt++;
				idx = i;
			}
		}

		System.out.println(cnt);
		
		br.close();
	}
}
