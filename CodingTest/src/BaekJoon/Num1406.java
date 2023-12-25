package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());
		
		Stack<Character> lStack = new Stack<>();
		Stack<Character> rStack = new Stack<>();
				
		for (char ch : str.toCharArray()) {
			lStack.push(ch);
		}
		
		for (int i = 0; i < M; i++) {
			String command = br.readLine();
			
			if (command.equals("L")) {
				if (!lStack.isEmpty()) {
					rStack.push(lStack.pop());
				}
			} else if (command.equals("D")) {
				if (!rStack.isEmpty()) {
					lStack.push(rStack.pop());
				}
			} else if (command.equals("B")) {
				if (!lStack.isEmpty()) {
					lStack.pop();
				}
			} else {
				lStack.push(command.charAt(2));
			}
		} 
		
		while(!lStack.isEmpty()) {
			rStack.push(lStack.pop());
		}
		
		StringBuilder sb = new StringBuilder();
		while(!rStack.isEmpty()) {
			sb.append(rStack.pop());
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}