package BaekJoon;

import java.util.Scanner;

public class Num2503 {
	static int[][] arr;
	static int cnt = 0;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n][3];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(check());
		
		sc.close();
	}
	static int check() {		
		for (int i = 123; i <= 987; i++) {	
			if (!checkNum(i)) continue;
			int ch = 0;
			String str = String.valueOf(i);
			for (int j = 0; j < n; j++) {
				int strike = 0;
				int ball = 0;
				String str2 = String.valueOf(arr[j][0]);
				for (int k = 0; k < 3; k++) {
					if (str.charAt(k) == str2.charAt(k)) {
						strike++;
					}
				}
				for (int q = 0; q < 3; q++) {
					for (int u = 0; u < 3; u++) {
						if (str.charAt(q) == str2.charAt(u)) {
							if (q != u) {
								ball++;
							}
						}
					}
				}
				if (strike == arr[j][1] && ball == arr[j][2]) {
					ch++;
				}			
			}
			if (ch == n) {
				cnt++;
			}
		}
		
		return cnt;
	}
	static boolean checkNum(int i) {
		String str = String.valueOf(i);
		
		// 1 ~ 9까지 3자리가 서로 다른 수 구하기
		if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(0) == str.charAt(2) ||
				str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') {
			return false;
		}
		
		return true;
	}
}
