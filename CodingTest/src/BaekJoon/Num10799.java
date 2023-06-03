package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Num10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		Stack<Character> stack = new Stack<Character>();
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.add('(');
			}
			else {
				stack.pop();
				if (str.charAt(i - 1) == '(') {
					cnt += stack.size();
				}
				else {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
