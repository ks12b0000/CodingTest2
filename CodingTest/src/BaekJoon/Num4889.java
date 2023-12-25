package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Num4889 {
	/* 17분 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int idx = 1;
//		
//		while(true) {
//			int change = 0;
//			String str = sc.next();
//			if (str.contains("-")) break; // 2번째 채점 여기서 ---로 찾음 - 하나 이상 있으면 break
//			
//			Stack<Character> stack = new Stack<>();
//			
//			for (int i = 0; i < str.length(); i++) {
//				if (stack.isEmpty() && str.charAt(i) == '}') {
//					change++;
//					stack.add('{');
//					continue;
//				} 
//				if (str.charAt(i) == '{') {
//					stack.add('{');
//				} else if (!stack.isEmpty() && str.charAt(i) == '}') { // 1번째 채점 여기서 !stack.isEmpty() 빼먹
//					stack.pop();
//				}
//			}
//			int answer = (stack.size() / 2) + change;
//			System.out.println(idx++ + ". " + answer);
//		}
//		
//		sc.close();
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		
		while(true) {
			int change = 0;
			String str = sc.next();
			
			if (str.contains("-")) break; 
			
			Stack<Character> stack = new Stack<>();
			
			for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{') {
                    stack.push('{');
                } else if (str.charAt(i) == '}') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        change++;
                        stack.push('{');
                    }
                }
            }

			int answer = (stack.size() / 2) + change;
			System.out.println(idx++ + ". " + answer);
		}
		
		sc.close();
	}
}
