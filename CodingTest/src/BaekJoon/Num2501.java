package BaekJoon;

import java.util.Scanner;

public class Num2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
			
		for (int i = 1; i <= n; i++) { 
			int a = 0;
			if (n % i == 0) { 
				a = i;  
				cnt++;
			}
			if (cnt == k) {
				System.out.println(a);
				break;
			}
		}
		if (cnt < k) {
			System.out.println(0);
		}
		sc.close();
	}
}
