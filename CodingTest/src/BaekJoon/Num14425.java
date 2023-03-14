package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Num14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> hashSet = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			hashSet.add(br.readLine());
		}
		int cnt = 0;
		for (int i = 0; i < m; i++) {
			if (hashSet.contains(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}	
