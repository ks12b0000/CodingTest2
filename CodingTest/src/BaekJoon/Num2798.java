package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {		
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {	
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					tmp = arr[i] + arr[j] + arr[k];
					if (tmp <= m) {
						max = Math.max(max, tmp);
					}
				}
			}
		}
		System.out.println(max);
		
		br.close();
	}
}
