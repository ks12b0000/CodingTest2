package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Num10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] narr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) {
			narr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(narr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			int marr = Integer.parseInt(st.nextToken());
			int lt = 0;
			int rt = n - 1;
			while (lt <= rt) {
				int mid = (lt + rt) / 2;
				if (narr[mid] == marr) {
					sb.append(1 + " ");
					break;
				}
				if (narr[mid] > marr) {
					rt = mid - 1;
				}
				else {
					lt = mid + 1;
				}
				if (lt > rt) {
					sb.append(0 + " ");
					break;
				}
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
