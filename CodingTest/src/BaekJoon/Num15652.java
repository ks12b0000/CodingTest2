package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15652 {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs(1, 0);
		System.out.println(sb);
		
		br.close();
	}
	public static void dfs(int at, int depth) {
		if (M == depth) {
			for (int x : arr) {
				sb.append(x + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(at, depth + 1);
			at++;
		}
	}
}