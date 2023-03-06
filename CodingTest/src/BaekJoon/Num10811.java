package BaekJoon;

import java.util.Scanner;

public class Num10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}		
		for (int j = 0; j < M; j++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;	
			
			while (a < b) {
				int tmp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = tmp;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}