package BaekJoon;

import java.util.Scanner;

public class Num10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < M; i++) {
			int q = sc.nextInt();
			int w = sc.nextInt();
			int e = sc.nextInt();
			for (int j = q - 1; j < w; j++) {
				arr[j] = e;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}