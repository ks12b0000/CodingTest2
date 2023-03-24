package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String a = br.readLine();
			if (a.equals(".")) {
				break;
			}
			
			System.out.println(solution(a));	
		}	
		
		br.close();
	}
	static String solution(String a) {
		Stack<Character> stack = new Stack<>();
		for (char x : a.toCharArray()) {
			if (x == '(') {
				stack.push('(');
			}
			else if (x == '[') {
				stack.push('[');
			}
			else if (x == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if (x == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) return "yes";
		else return "no";
	}
}
