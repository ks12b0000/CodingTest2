package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		String b = br.readLine();
		
		for (char x : str.toCharArray()) {
			stack.add(x);
			if (stack.size() >= b.length()) {
				boolean flag = true;
				for (int i = 0; i < b.length(); i++) {
					if (stack.get(stack.size() - b.length() + i) != b.charAt(i)) {
                        flag = false;
                        break;
                    }
				}
				if (flag) {
					for (int j = 0; j < b.length(); j++) {
						stack.pop();
					}
				}
			}			
		}
		
		StringBuilder sb = new StringBuilder();
		if (stack.isEmpty()) {
			System.out.println("FRULA");
		}
		else {
			for (char y : stack) {
				sb.append(y);
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
