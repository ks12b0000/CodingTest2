package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] sum = new int[n];
		int max = Integer.MIN_VALUE;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			sum[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for (int i = 0; i <= n - k; i++) {
			int num = 0;
			for (int j = i; j < k + i; j++) {
				num += sum[j];
			}
			max = Math.max(max, num);
		}
		
		System.out.println(max);
		
		br.close();
	}
}
