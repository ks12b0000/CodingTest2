package Programmers;

import java.util.Stack;

public class 올바른괄호 {
	boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        
        if (s.charAt(0) == ')') {
            return answer;
        }
        
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            }
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }                
            }
        }

        return answer = stack.isEmpty();
    }
}
