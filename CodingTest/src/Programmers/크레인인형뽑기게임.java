package Programmers;

import java.util.*;

public class 크레인인형뽑기게임 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int x : moves) {
        	for (int i = 0; i < board.length; i++) {
        		if (board[i][x - 1] != 0) {
        			int tmp = board[i][x - 1];
        			board[i][x - 1] = 0;
        			if (!stack.isEmpty() && stack.peek() == tmp) {
        				stack.pop();
        				answer += 2;
        			}
        			else {
        				stack.add(tmp);
        			}
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
