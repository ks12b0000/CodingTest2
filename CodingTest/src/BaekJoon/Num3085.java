package BaekJoon;

import java.util.Scanner;

public class Num3085 {
	static char[][] board;
	static int n;
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		board = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			board[i] = sc.next().toCharArray();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				char swap = board[i][j];
				board[i][j] = board[i][j + 1];
				board[i][j + 1] = swap;
				
				search();
				
				swap = board[i][j];
				board[i][j] = board[i][j + 1];
				board[i][j + 1] = swap;
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				char swap = board[j][i];
				board[j][i] = board[j + 1][i];
				board[j + 1][i] = swap;
				
				search();
				
				swap = board[j][i];
				board[j][i] = board[j + 1][i];
				board[j + 1][i] = swap;
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
	static int search() {
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n - 1; j++) {
				if (board[i][j] == board[i][j + 1]) {
					cnt++;
				}
				else {
					cnt = 1;
				}
				max = Math.max(cnt, max);
			}
		}
		
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n - 1; j++) {
				if (board[j][i] == board[j + 1][i]) {
					cnt++;
				}
				else {
					cnt = 1;
				}
				max = Math.max(cnt, max);
			}			
		}
		
		return max;
	}
}
