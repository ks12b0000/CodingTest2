package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num14888 {
	static int n;
	static int[] arr;
	static int[] cal = new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			cal[i] = Integer.parseInt(st.nextToken());
		}
		
		DFS(arr[0], 1);
		System.out.println(max + "\n" + min);
		
		br.close();
	}
	public static void DFS(int num, int idx) {
		if (idx == n) {
			max = Math.max(num, max);
			min = Math.min(num, min);
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (cal[i] > 0) {
				cal[i]--;
				switch(i) {
				case 0 :
					DFS(num + arr[idx], idx + 1);
					break;
				case 1 :
					DFS(num - arr[idx], idx + 1);
					break;
				case 2 :
					DFS(num * arr[idx], idx + 1);
					break;
				case 3 :
					DFS(num / arr[idx], idx + 1);
					break;
				}
			}
			cal[i]++;
		}
	}
}
