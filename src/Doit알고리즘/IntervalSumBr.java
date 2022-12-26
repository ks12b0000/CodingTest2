package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.StringTokenizer;

public class IntervalSumBr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		//int[] arr = new int[A];
		int[] S = new int[A+1];
		
		st = new StringTokenizer(br.readLine());
 
		for(int i = 0; i < A; i++) {

			//arr[i] = Integer.parseInt(st.nextToken());
			S[i+1] = S[i] + Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < B; i++) {
			
			st = new StringTokenizer(br.readLine());

			int k = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(S[j] - S[k-1]);	
			
		}
		
		
		
		
		br.close();

	}

}
