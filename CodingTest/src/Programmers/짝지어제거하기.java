package Programmers;

import java.util.Stack;

public class 짝지어제거하기 {
	public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
        	if (stack.isEmpty()) {
        		stack.push(s.charAt(i));
        	}
        	else if (stack.peek() == s.charAt(i)) {
        		stack.pop();
        	}
        	else {
        		stack.push(s.charAt(i));
        	}
        }
   
        if (stack.isEmpty()) {
        	answer = 1;
        }
        
        return answer;
    }
}
