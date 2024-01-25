package BaekJoon;

import java.util.Scanner;

public class Num12852 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		while (N != 1) {
			
			if ((N - 1) % 3 == 0 || (N - 1) % 2 == 0) {
				cnt++;
				N -= 1;
			}
			if (N % 3 == 0) {
				cnt++;
				N /= 3;
			} else if (N % 2 == 0) {
				cnt++;
				N /= 2;
			}
			
		}
		
		System.out.println(cnt);
//		System.out.print();
		
		sc.close();
	}
}
