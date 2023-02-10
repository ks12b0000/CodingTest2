package InflearnCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Num5_1 {
	public String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>(); // Stack은 (Last In First Out)
		
		for (char x : str.toCharArray()) { // char x에 str 문자들을 하나씩 넣어줌
			if (x == '(') {	// 만약 x가 '('면 stack에 넣어줌.
				stack.push(x);
			}
			else { // '('가 아니면
				if (stack.isEmpty()) { // 만약 stack이 비어있으면 NO
					return "NO";
				}
				stack.pop(); // stack에서 지워줌				
			}			
		}		
		if (!stack.isEmpty()) { // for문이 끝났는데도 stack에 남아있는게 있으면 NO
			return "NO";
		}
		return answer;
	}
	public static void main(String[] args) {
		Num5_1 T = new Num5_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}

}
