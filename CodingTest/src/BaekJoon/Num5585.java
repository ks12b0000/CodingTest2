package BaekJoon;

import java.util.Scanner;

public class Num5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1000 - sc.nextInt();
		int cnt = 0;
		int[] arr = {500, 100, 50, 10, 5, 1};
		
//		while (a != 0) {
//			if (a >= 500) {
//				cnt += a / 500;
//				a = a % 500;		
//			}
//			else if (a >= 100) {
//				cnt += a / 100;
//				a = a % 100;			
//			}
//			else if (a >= 50) {
//				cnt += a / 50;
//				a = a % 50;				
//			}
//			else if (a >= 10) {
//				cnt += a / 10;
//				a = a % 10;				
//			}
//			else if (a >= 5) {
//				cnt += a / 5;
//				a = a % 5;				
//			}
//			else if (a >= 1) {
//				cnt += a / 1;
//				a = a % 1;				
//			}
//		}		
		
		for (int i = 0; i < arr.length; i++) {
			if (n / arr[i] > 0) {
				cnt += n / arr[i];
				n = n % arr[i];
			}
		}
		
		System.out.println(cnt);
		
		
		sc.close();
	}
}
