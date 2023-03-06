package BaekJoon;

import java.util.Scanner;

public class Num2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int answer = 0;
		String str = "";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				answer = Math.max(answer, arr[i][j]);
			}
		}		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (answer == arr[i][j]) {
					str = ((i + 1) + " " + (j + 1));
					break;
				}
			}
		}
		System.out.print(answer + "\n" + str);
		sc.close();
	}
}
