package Programmers;

import java.util.Stack;

public class 올바른괄호 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')') {
                return false;
            }
        	if (s.charAt(i) == '(') {
        		stack.push('(');
        	}
        	else {
        		if (!stack.isEmpty()) {
        			stack.pop();
        		}
        	}
        }

        answer = stack.isEmpty();
        
        return answer;
    }
}
