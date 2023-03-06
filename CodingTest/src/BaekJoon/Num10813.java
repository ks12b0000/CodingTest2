package BaekJoon;

import java.util.Scanner;

public class Num10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}		
		for (int j = 0; j < M; j++) {
			int num = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			num = arr[a - 1];
			arr[a - 1] = arr[b - 1];
			arr[b - 1] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}