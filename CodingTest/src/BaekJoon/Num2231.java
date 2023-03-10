package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tmp = 0;
		
		for (int i = 0; i < n; i++) {
			int number = i;
			int sum = 0;			
			while (number > 0) {
				sum += number % 10;
				number = number / 10;
			}			
			if (sum + i == n) {
				tmp = i;
				break;
			}
		}
		
		System.out.println(tmp);
		
		br.close();
	}
}
