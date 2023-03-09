package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());		
		int[] arr = new int[10001]; 
		 
		for (int i = 0; i < n; i++) {	
			arr[Integer.parseInt(br.readLine())]++;	
		}
		
		for(int i = 1; i < 10001; i++) {			
			while(arr[i]-- > 0) {	
				sb.append(i + "\n");
			}
		}
		System.out.print(sb);
		br.close();
	}
}
