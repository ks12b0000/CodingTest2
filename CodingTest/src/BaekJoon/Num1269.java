package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Num1269 {
	// 방법 1
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		int[] a = new int[n];
//		HashSet<Integer> aarr = new HashSet<>();
//		HashSet<Integer> b = new HashSet<>();
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < n; i++) {
//			int input = Integer.parseInt(st.nextToken());
//			a[i] = input;
//			aarr.add(input);
//		}
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < m; i++) {
//			int input2 = Integer.parseInt(st.nextToken());
//			b.add(input2);
//			if (aarr.contains(input2)) {
//				aarr.remove(input2);
//			}
//		}
//		
//		for (int i = 0; i < n; i++) {
//			if (b.contains(a[i])) {
//				b.remove(a[i]);
//			}
//		}		
//		
//		System.out.println(aarr.size() + b.size());
//		
//		br.close();
//	}
	
	
	
	// 방법 2
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
				HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> b = new HashSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		for (int x : a) {
			if (!b.contains(x)) {
				cnt++;
			}
		}
		
		for (int x : b) {
			if (!a.contains(x)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}
