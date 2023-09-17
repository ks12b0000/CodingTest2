package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int min = 0;
		int max = n - 1;
		int minValue = Integer.MAX_VALUE;
		
		int[] answer = new int[2];
		
		while (min < max) {
			int sum = arr[min] + arr[max];
			int absSum = Math.abs(sum);
			if (absSum < minValue) {
				minValue = absSum;
				answer[0] = arr[min];
				answer[1] = arr[max];
			}
			if (sum > 0) max--;
			else min++;
		}
		
		System.out.print(answer[0] + " " + answer[1]);
		
		br.close();
	}
}
