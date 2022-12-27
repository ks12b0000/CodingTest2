package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AvgBr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int max = 0;
		double sum = 0.0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < A; i++) {
			int B = Integer.parseInt(st.nextToken());
			
			if(B > max) {
				max = B;
			}
			sum += B; 
		}
		System.out.println(((sum/max)*100)/A);
		
		br.close();

	}

}
