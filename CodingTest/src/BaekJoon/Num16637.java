package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num16637 {
	static int max = Integer.MIN_VALUE;
	static ArrayList<Character> opList = new ArrayList<Character>();
	static ArrayList<Integer> numList = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (c == '-' || c == '+' || c == '*') {
				opList.add(c);
			}
			else {
				numList.add(Character.getNumericValue(c));
			}
		}
		
		DFS(numList.get(0), 0);
		System.out.println(max);
		
		sc.close();
	}
	static void DFS(int num, int idx) {
		if (idx >= opList.size()) {
			max = Math.max(max, num);
			return;
		}
		
		// 괄호X
		int result1 = calc(opList.get(idx), num, numList.get(idx + 1));
		DFS(result1, idx + 1);
		
		// 괄호O
		if (idx + 1 < opList.size()) {
			int result2 = calc(opList.get(idx + 1), numList.get(idx + 1), numList.get(idx + 2));
			int result3 = calc(opList.get(idx), num, result2);
			
			DFS(result3, idx + 2);
		}
	}
	static int calc(char op, int num1, int num2) {
		if (op == '-' ) {
			return num1 - num2;
		}
		else if (op == '+') {
			return num1 + num2;
		}
		else {
			return num1 * num2;
		}
	}
}
