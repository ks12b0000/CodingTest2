package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSumBr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < A; i++) {
			sum += B.charAt(i) - '0';
		}System.out.println(sum);
		
		br.close();
	}

}
