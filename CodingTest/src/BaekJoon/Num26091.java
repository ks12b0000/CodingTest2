package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num26091 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int left = 0;
		int rigth = arr.length - 1;
		
		while (left < rigth) {
			int sum = arr[left] + arr[rigth];
			if (sum >= M) {
				answer++;
				left++;
				rigth--;
			} else {
				left++;
			}
		}
		
		System.out.println(answer);
		// 3 3 5 5 6 7
		
		br.close();
	}
}
