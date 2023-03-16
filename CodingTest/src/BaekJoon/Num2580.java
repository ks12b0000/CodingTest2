package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2580 {
	static int[][] arr = new int[9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0, 0);
		
		br.close();
	}
	public static void sudoku(int x, int y) {
		if (y == 9) {
			sudoku(x + 1, 0);
			return;
		}
		if (x == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);		
		}
		
		if (arr[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if(check(x, y, i)) {
					arr[x][y] = i;
					sudoku(x, y + 1);
				}
			}
			arr[x][y] = 0;
			return;
		}
		sudoku(x, y + 1);
	}
	public static boolean check(int x, int y, int value) {
		for (int i = 0; i < 9; i++) {
			if (arr[x][i] == value) {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (arr[i][y] == value) {
				return false;
			}
		}
		int set_x = (x / 3) * 3; // value가 속한 3x3의 행의 첫 위치
		int set_y = (y / 3) * 3; // value가 속한 3x3의 열의 첫 위치
 
		for (int i = set_x; i < set_x + 3; i++) {
			for (int j = set_y; j < set_y + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; 
	}
}
