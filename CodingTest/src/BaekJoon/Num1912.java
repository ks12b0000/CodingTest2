package BaekJoon;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Num1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] ch = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		ch[0] = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < n; i++) {
			ch[i] = Math.max(ch[i - 1] + arr[i], arr[i]);
			max = Math.max(ch[i], max);
		}
		System.out.println(max);		
		
		br.close();
	}
}	
