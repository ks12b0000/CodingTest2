package BaekJoon;

import java.util.Scanner;

public class Num10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] str = new char[5][15];
		String answer = "";
		for (int i = 0; i < 5; i++) {
			String a = sc.next();
			for (int j = 0; j < a.length(); j++) {
				str[i][j] = a.charAt(j);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(str[j][i] == '\0') continue;
				answer += str[j][i];
			}		
		}
		System.out.println(answer);
		sc.close();
	}
}
