package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15649 {
	public static int[] arr;
	public static boolean[] visit;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int depth) {
		if (depth == M) {
			for (int x : arr) {
				sb.append(x + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visit[i] = false; 
			}
		}
	}
}
