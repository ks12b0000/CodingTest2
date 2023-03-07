package BaekJoon;

import java.util.Scanner;

public class Num1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cnt = 0;
		int n = 0;
		while (true) {
			n++;
			cnt += n;
			if(cnt >= x) {
				if(n % 2 == 0) {
					System.out.println(x - cnt + n + "/" + (cnt - x + 1));
				}
				else {
					System.out.println(cnt - x + 1 + "/" + (x - cnt + n));
				}
				break;
			}
		}
		
		sc.close();
	}
}
