package BaekJoon;

import java.util.Scanner;

public class Num2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] arr = new int[15][15];
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			for (int u = 0; u < 15; u++) {
				arr[0][u] = u; // 0층에 1 ~ 14번 호수에 사는 사람수 넣어주고
			}
			for (int j = 1; j < 15; j++) {
				for (int q = 1; q < 15; q++) { // 1 ~ 14층에 1 ~ 14호수에 사람 구하는 식
					arr[j][q] = arr[j - 1][q] + arr[j][q - 1]; // 현재 위치에서 층수 -1 호수에 사는 사람수 + 현재 위치의 전 호수에 사는 사람수를 더해주면 됨.
				}
			}
			System.out.println(arr[k][n]);
		}
		
		sc.close();
	}
}
/**
 *     
4층1 6 21 56 126 252
3층 1 5 15 35 70 126
2층 1 4 10 20 35 56
1층 1 3 6 10 15 21
0층 1 2 3 4 5 6
 */
