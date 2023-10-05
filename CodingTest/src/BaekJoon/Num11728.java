package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] nArr = new int[n];
		int[] mArr = new int[m];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}
				
		int idx = 0;
		int nIdx = 0;
		int mIdx = 0;
		StringBuilder sb = new StringBuilder();
		
		while (idx++ < n + m) {
			if (nIdx >= n) {
				sb.append(mArr[mIdx++] + " ");
				continue;
			}
			else if (mIdx >= m) {
				sb.append(nArr[nIdx++] + " ");
				continue;
			}
			if (nArr[nIdx] < mArr[mIdx]) {
				sb.append(nArr[nIdx++] + " ");
			}
			else {
				sb.append(mArr[mIdx++] + " ");
			}
			
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
