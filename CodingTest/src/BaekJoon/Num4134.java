package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Num4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			BigInteger a = new BigInteger(br.readLine());
			
			if (a.isProbablePrime(10)) { // 만약 입력값이 소수인지 아닌지 판별하는 것
				System.out.println(a);
			}
			else {
				System.out.println(a.nextProbablePrime()); // 입력값보다 큰 바로 다음 소수를 알려주는 것
			}			
		}
		
		br.close();
	}
}
