package BaekJoon;

import java.util.Scanner;

public class Num1343 {
	// 구현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String board = sc.next();
		
		String str = "";
		for (char c : board.toCharArray()) {
			if (c == '.') {		
				String temp = check(str);
				if (temp.equals("-1")) {
					System.out.println("-1");
					return;
				}
				answer += temp;
				answer += ".";
				str = "";
			} else {
				str += c;
			}
		}
		
		String temp = check(str);
		if (temp.equals("-1")) {
			answer = "-1";
		} else {
			answer += temp;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
	private static String check(String str) {
		String answer = "";
		if (str.length() % 2 != 0) {
			return "-1";
		}
		
		int len = str.length();
		while (true) {
			if (len >= 4) {
				answer += "AAAA";
				len -= 4;
			} else if (len >= 2) {
				answer += "BB";
				len -= 2;
			} else {
				break;
			}
		}
		
		return answer;
	}
	
	
	// replace 사용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";
//		String board = sc.next();
//		
//		board = board.replaceAll("XXXX", "AAAA");
//		answer = board.replaceAll("XX", "BB");
//		
//		if (answer.contains("X")) {
//			answer = "-1";
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
}
