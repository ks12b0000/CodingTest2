package BaekJoon;

import java.util.Scanner;

public class Num2578 {
	static int[][] bingo;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		bingo = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 25; i++) {
			int num = sc.nextInt();
			
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					if (bingo[j][k] == num) {
						bingo[j][k] = 0;
					}
				}
			}
			
			check1();
			check2();
			check3();
			check4();
			
			if (cnt >= 3) {
				System.out.println(i + 1);
				break;
			}
			cnt = 0;
		}
		
		sc.close();
	}
	
	// 가로
	static void check1() {
		for (int i = 0; i < 5; i++) {
			int ch = 0;
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] == 0) {
					ch++;
				}
			}
			if (ch == 5) {
				cnt++;
			}
		}
	}

	// 세로
	static void check2() {
		for (int i = 0; i < 5; i++) {
			int ch = 0;
			for (int j = 0; j < 5; j++) {
				if (bingo[j][i] == 0) {
					ch++;
				}
			}
			if (ch == 5) {
				cnt++;
			}
		}
	}

	// 왼 -> 오 대각선
	static void check3() {
		int ch = 0;
		for (int i = 0; i < 5; i++) {
			if (bingo[i][i] == 0) {
				ch++;
			}
		}
		if (ch == 5) {
			cnt++;
		}
	}

	// 오 -> 왼 대각선
	static void check4() {
		int ch = 0;
		for (int i = 0; i < 5; i++) {
			if (bingo[i][4 - i] == 0) {
				ch++;
			}
		}
		if (ch == 5) {
			cnt++;
		}
	}
}
