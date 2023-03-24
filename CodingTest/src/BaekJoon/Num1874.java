package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int start = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a > start) {
				for(int j = start + 1; j <= a; j++) {
					stack.push(j);
					sb.append("+" + "\n");
				}
				start = a; 	
			}
			if (stack.peek() != a) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-" + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
