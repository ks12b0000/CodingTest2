package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4779 {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		
		while ((str = br.readLine()) != null) {
			sb = new StringBuilder();
			int n = Integer.parseInt(str);
			int len = (int) Math.pow(3, n); 
			
			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			
			solution(0, len);
			System.out.println(sb);
		}
		
		br.close();
	}
	static void solution(int start, int size) { 
		if (size == 1) return;
		
		int newSize = size / 3; 
		
		for (int i = start + newSize; i < start + 2 * newSize; i++) {
			sb.setCharAt(i, ' '); 
		}
		
		solution(start, newSize); 
		solution(start + 2 * newSize, newSize); 
	}
}
