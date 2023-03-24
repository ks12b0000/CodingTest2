package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) {
				stack.pop();
			}
			else {
				stack.push(a);
			}
		}
		
		int sum = 0;
		
		for (int x : stack) sum += x;
		
		System.out.println(sum);
		
		br.close();
	}
}
