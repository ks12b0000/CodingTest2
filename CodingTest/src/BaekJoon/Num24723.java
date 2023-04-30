package BaekJoon;

import java.util.Scanner;

public class Num24723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[5];
		arr[0] = 2;
		for (int i = 1; i < 5; i++) {
			arr[i] = arr[i - 1] * 2;
		}
		
		System.out.println(arr[a - 1]);
		
		sc.close();
	}
}
