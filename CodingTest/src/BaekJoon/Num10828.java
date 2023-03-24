package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Num10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			String a = sc.nextLine();
			
			if (a.contains("push")) {
				String b = a.substring(5);
				stack.push(Integer.parseInt(b));
			}
			else if (a.equals("top")) {
				if (stack.isEmpty()) sb.append(-1 + "\n");
				else sb.append(stack.peek() + "\n");
			}
			else if (a.equals("size")) {
				sb.append(stack.size() + "\n");
			}
			else if (a.equals("empty")) {
				if (stack.isEmpty()) sb.append(1 + "\n");
				else sb.append(0 + "\n");
			}
			else if (a.equals("pop")) {
				if (stack.isEmpty()) sb.append(-1 + "\n");
				else sb.append(stack.pop() + "\n");
			}
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}	
