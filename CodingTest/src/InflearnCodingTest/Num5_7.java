package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num5_7 {
	public String solution(String str, String str2) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		
		for (char x : str.toCharArray()) { // char x에 str문자들을 담아주고 queue에 저장
			queue.offer(x);
		}
		
		for (char y : str2.toCharArray()) { // char y에 str2문자들을 담아주면서
			if (queue.contains(y)) { // queue안에 y가 있는데(queue = 필수과목)
				if (y != queue.poll()) {  // y랑 queue에 첫번째 문자랑 다르면 return NO (첫번째 queue부터 수강을 해야 다음 과목을 들을수 있으므로)
					return "NO";
				}				
			}
		}
		if (!queue.isEmpty()) { // 검증이 다 끝났는데도 queue에 값이 남아있으면 return NO
			return "NO";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num5_7 T = new Num5_7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str, str2));
		sc.close();
	}

}
