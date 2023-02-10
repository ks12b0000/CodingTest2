package InflearnCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Num5_2 {
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		
		for (char x : str.toCharArray()) { // char x 에 str 문자들 넣어줌
			if (x == ')') { // x가 ')'면
				while (stack.pop() != '('); // '(' 만날 때 까지 지워줌.
			}
			else {
				stack.push(x); // 아니면 stack에 저장.
			}
		}
		for (int i = 0; i < stack.size(); i++) { 
			answer += stack.get(i); // answer에 stack.get(i) 번째 값들을 넣어줌.
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num5_2 T = new Num5_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
