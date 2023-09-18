package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n + 1];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = 0;
		int max = 0;
		int sum = 0;
		int length = Integer.MAX_VALUE;
		
		while (max <= n) {	
			if (sum >= s) {
				length = Math.min(length, max - min);
				sum -= arr[min++];
			}
			else {
				sum += arr[max++];
			}
		}
		
		System.out.println(length == Integer.MAX_VALUE ? 0 : length);
		
		
		br.close();
	}
}
