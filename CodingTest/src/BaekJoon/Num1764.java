package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Num1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> hashSet = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			hashSet.add(br.readLine());
		}
		
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			if (hashSet.contains(s)) {
				arr.add(s);
			}
		}
		
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size() + "\n");
		for (String x : arr) {
			sb.append(x + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
