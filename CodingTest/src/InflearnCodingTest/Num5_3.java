package InflearnCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Num5_3 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int x : moves) { // x에 moves를 하나씩 넣어주면서
        	for (int i = 0; i < board.length; i++) { // 0 ~ board.length 전까지
        		if (board[i][x - 1] != 0) { // 만약 [0~board.length 전까지][x-1]이 0이 아니면 
        			int tmp = board[i][x - 1]; // int tmp에 board[i][x-1]을 넣어주고
        			board[i][x - 1] = 0; // 넣어줬으면 0으로 만들어줌
        			if (!stack.isEmpty() && stack.peek() == tmp) { // 만약 stack이 비어있지않고 stack에 제일 위에있는 값이 tmp랑 같으면
        				answer += 2; // answer에 +2해줌. (같은값이 나오면 2개가 터지기 때문)
        				stack.pop(); // 그러고 stack에서 지워줌
        			}
        			else { // 아니면 stack에 넣어줌.
        				stack.push(tmp);
        			} // 그러고 for문 멈춰줌
        			break;
        		}
        	}
        }      
        return answer;
    }
	public static void main(String[] args) {
		Num5_3 T = new Num5_3();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] board = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int num2 = sc.nextInt();
		int[] moves = new int[num2];
		for (int i = 0; i < num2; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(T.solution(board, moves));
		sc.close();
	}
}
