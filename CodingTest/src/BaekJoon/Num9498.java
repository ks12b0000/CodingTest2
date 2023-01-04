package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num9498 {
	
	
	
	/* 프로그래머스 방식 */
//	public String solution(int num) {
//		String answer = "";
//		
//		if (num > 89) {
//			answer = "A";
//		}
//		else if(num > 79) {
//			answer = "B";
//		}
//		else if (num > 69) {
//			answer = "C";
//		}
//		else if (num > 59) {
//			answer = "D";
//		}
//		else {
//			answer = "F";
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num9498 T = new Num9498();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(T.solution(num));
//		sc.close();
//	}

	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";		
//		int num = sc.nextInt();
//		
//		if (num > 89) {					// 만약 90점 이상이면 A 출력 80점 이상이면 B 출력 70점 이상이면 C 출력 60점 이상이면 D 출력 그 이하면 F 출력
//			answer = "A";
//		}
//		else if(num > 79) {
//			answer = "B";
//		}
//		else if (num > 69) {
//			answer = "C";
//		}
//		else if (num > 59) {
//			answer = "D";
//		}
//		else {
//			answer = "F";
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		int num = Integer.parseInt(br.readLine());
		
		if (num > 89) {
			answer = "A";
		}
		else if(num > 79) {
			answer = "B";
		}
		else if (num > 69) {
			answer = "C";
		}
		else if (num > 59) {
			answer = "D";
		}
		else {
			answer = "F";
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
