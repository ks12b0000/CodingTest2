package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num1620 {
	// 방법 1
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
//		String[] nameArr = new String[n + 1];
//		
//		for (int i = 1; i <= n; i++) {
//			String name = br.readLine();
//			hashMap.put(name, i);
//			nameArr[i] = name;
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < m; i++) {
//			String s = br.readLine();
//			if (hashMap.get(s) != null) {
//				sb.append(hashMap.get(s));
//			}
//			else {
//				sb.append(nameArr[Integer.parseInt(s)]);
//			}	
//			sb.append("\n");
//		}
//		
//		System.out.println(sb);
//		
//		br.close();
//	}
	
	
	
	
	// 방법 2
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			String name = br.readLine();
			hashMap.put(name, Integer.toString(i));
			hashMap.put(Integer.toString(i), name);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(hashMap.get(br.readLine()) + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
