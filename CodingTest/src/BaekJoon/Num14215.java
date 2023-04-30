package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		
		if (arr[0] + arr[1] > arr[2]) {
			System.out.println(arr[0] + arr[1] + arr[2]);
		}
		else {
			System.out.println((arr[0] + arr[1]) * 2 - 1);
		}
	
		
		sc.close();
	}
}
