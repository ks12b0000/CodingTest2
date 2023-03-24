package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == '(') {
					stack.push('(');
				}
				else if (a.charAt(j) == ')') {
					if (stack.contains('(')) {
						stack.pop();
					}
					else stack.push(')');
				}
			}
			if (stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
			stack.clear();
		}
		
		br.close();
	}
}
