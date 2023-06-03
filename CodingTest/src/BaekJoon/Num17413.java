package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Num17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		boolean ch = false;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				ch = true;
				while (!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) == '>') {
				ch = false;
				System.out.print(str.charAt(i));
			}
			else if (ch) {
				System.out.print(str.charAt(i));
			}
			else if (!ch) {
				if (str.charAt(i) == ' ') {
					while (!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(str.charAt(i));
				}
				else {
					stack.push(str.charAt(i));
				}
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
				
		sc.close();
	}
}
