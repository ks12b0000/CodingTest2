package BaekJoon;

import java.util.Scanner;

public class Num10448 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new int[45];
		
		for (int i = 1; i < 45; i++) {
			arr[i] = i * (i + 1) / 2;
 		}
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			System.out.println(eureka(num));
		}
		
		sc.close();
	}
	static int eureka(int n) {
		for (int i = 1; i < 45; i++) {
			for (int j = 1; j < 45; j++) {
				for (int k = 1; k < 45; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (n == sum) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
