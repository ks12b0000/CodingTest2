package BaekJoon;

import java.util.Scanner;

public class Num2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = {25, 10, 5, 1};
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(a / arr[j] + " ");
				a %= arr[j];
			}
			System.out.println();
		}
		
		sc.close();
	}
}
