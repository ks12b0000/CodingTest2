package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr);		
		String tmp = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j].length() < arr[j - 1].length()) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
		
		
		br.close();
	}
}
