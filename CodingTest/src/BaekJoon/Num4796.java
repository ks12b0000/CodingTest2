package BaekJoon;

import java.util.Scanner;

public class Num4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		while (true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			
			if (L == 0 && P == 0 && V == 0) {
				break;
			}
			
			int num = ((V / P) * L) + Math.min(L, (V % P));
			
			System.out.println("Case " + idx + ": " + num);
			idx++;
		}
		
		sc.close();
	}
}
