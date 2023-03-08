package BaekJoon;

import java.util.Scanner;

public class Num11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 2;
		
		while (n > 1) {
			if (n % cnt == 0) {
				System.out.println(cnt);
				n = n / cnt;
			}
			else {
				cnt++;
			}
			if (n == 1) {
				break;
			}
		}
		
		sc.close();
	}
}
