package InflearnCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Num5_5 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') { // 만약 str(i)번째 값이 '('면 stack에 '(' 넣어줌
				stack.push('(');
			}
			else { // 아니면 stack을 하나 꺼내주고
				stack.pop();
				if (str.charAt(i - 1) == '(') { // 만약 str(i-1)번째 값이 '('면(레이저임) answer에 stack에 남아있는 길이를 넣어줌.(그만큼 잘라지니까)				
					answer += stack.size();
				}
				else { // 아니면(막대가 끝나는 구간) answer++
					answer++;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num5_5 T = new Num5_5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
