package BaekJoon;

import java.util.Scanner;

public class Num1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int[] fibo = new int[41];
			int[] fibo2 = new int[41];
			
			fibo[0] = 1;
			fibo[1] = 0;
			fibo2[0] = 0;
			fibo2[1] = 1;
			
			for (int j = 2; j <= m; j++) {
				fibo[j] = fibo[j - 1] + fibo[j - 2];
				fibo2[j] = fibo2[j - 1] + fibo2[j - 2];
			}
			System.out.println(fibo[m] + " " + fibo2[m]);
		}
		
		sc.close();
	}
 }
