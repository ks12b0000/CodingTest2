package Programmers;

import java.util.Stack;

public class 괄호회전하기 {
	public int solution(String s) {
        int answer = 0;
        int len = s.length();
        char[] ch = s.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        while (len-- > 0) {
        	for (int i = 0; i < ch.length; i++) {
        		if (ch[i] == '(') {
        			stack.push('(');
        		}
        		else if (ch[i] == '[') {
        			stack.push('[');
        		}
        		else if (ch[i] == '{') {
        			stack.push('{');
        		}
        		if (!stack.isEmpty()) {
        			if (ch[i] == ')' && stack.peek() == '(') {
        				stack.pop();
        			}
        			else if ( ch[i] == ']' && stack.peek() == '[') {
        				stack.pop();
        			}
        			else if (ch[i] == '}' && stack.peek() == '{') {
        				stack.pop();
        			}
        		}
        		else {
        			stack.push(ch[i]);
        		}
        	}
        	if (stack.isEmpty()) answer++;
        	else stack.clear();
        	char m = ch[0];
        	for (int i = 0; i < ch.length - 1; i++) {
        		ch[i] = ch[i + 1];
        	}
        	ch[ch.length - 1] = m;
        }
        
        
        return answer;
    }
}
