package Programmers;

import java.util.Stack;

public class 택배상자 {
	public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int idx = 0;
     
        for (int i = 1; i <= order.length; i++) {
        	while (!stack.isEmpty() && stack.peek() == order[idx]) {
    			answer++;
    			stack.pop();     
    			idx++;
        	}
        	if (i == order[idx]) {
        		answer++;
        		idx++;
        	}
        	else {
        		stack.add(i);
        	}
        }
        
        while (!stack.isEmpty() && stack.peek() == order[idx]) {
			answer++;
			stack.pop();     
			idx++;
    	}
        
        return answer;
    }
}
