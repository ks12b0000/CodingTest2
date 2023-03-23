package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("-");
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;			
			String[] arr2 = arr[i].split("\\+");
			
			for (int j = 0; j < arr2.length; j++) {
				tmp += Integer.parseInt(arr2[j]);
			}
			if (min == Integer.MAX_VALUE) {
				min = tmp;
			}
			else {
				min -= tmp;
			}
		}
		System.out.println(min);
		
		br.close();
	}
}
