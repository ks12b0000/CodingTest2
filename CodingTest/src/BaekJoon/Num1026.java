package BaekJoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		Integer[] arr2 = new Integer[n];
		
		for (int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for (int i = 0; i< n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i] * arr2[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}	
