package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < n; i++) {				
			int tmp = Integer.parseInt(st.nextToken());
			if (hashMap.containsKey(tmp)) {
				hashMap.put(tmp, hashMap.get(tmp) + 1);
			}
			else {
				hashMap.put(tmp, 1);
			}			
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			int marr = Integer.parseInt(st.nextToken());
			if (hashMap.get(marr) == null) {
				sb.append(0 + " ");
			}
			else {
				sb.append(hashMap.get(marr) + " ");	
			}				
		}
		
		System.out.println(sb);
				
		br.close();
	}
}
