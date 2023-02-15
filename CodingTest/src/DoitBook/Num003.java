package DoitBook;

import java.util.Scanner;

public class Num003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] M = new int[2];
		for (int i = 0; i < M.length; i++) {
			M[i] = sc.nextInt(); // 5 3
		}
		int[] N = new int[M[0] + 1];
		for (int i = 1; i< N.length; i++) {
			N[i] = N[i - 1] + sc.nextInt(); // 0 5 9 12 14 15
		}
		
		for (int i = 0; i < M[1]; i++) {
			int A = sc.nextInt(); // 1
			int B = sc.nextInt(); // 3
			System.out.println(N[B] - N[A - 1]); // N[3] = 12 - N[A - 1] = 0 12 - 0 = 12
		}
		
		
		sc.close();
	}
}
