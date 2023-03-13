package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Num10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nArr);
		int M = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = nArr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) { //지금 상근이 카드보다 더 작은거 찾아야함
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
		
		System.out.println(sb);
		
		br.close();
	}
}
