package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2480 {
	
	
	
	/* 프로그래머스 방식 */
//	public int solution(int num, int num2, int num3) {
//		int answer = 0;
//		
//		if (num == num2 && num == num3 && num2 == num3) {  // 만약 1번째 숫자 == 2번째 숫자, 1번째 숫자 == 3번째 숫자, 2번째 숫자 3번째 숫자면 3개 다 같은 숫자 임.
//			answer += 10000 + (num * 1000);
//		}
//		else if (num == num2 || num == num3) {			   // 만약 1번째 숫자 == 2번째 숫자 이거나 1번째 숫자 == 3번째 숫자면 1번째 숫자로 식 만들어줌.
//			answer += 1000 + (num * 100);
//		}
//		else if (num2 == num3) {							// 만약 2번째 숫자 == 3번째 숫자면 2번째 숫자로 식 만들어줌.
//			answer += 1000 + (num2 * 100);
//		}
//		else {												// 다 다른 숫자면 제일 큰 수 구해서 식 만들어줌.
//			int max = Math.max(num, num2);
//			max = Math.max(max, num3);
//			answer += max * 100;
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2480 T = new Num2480();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		System.out.println(T.solution(num, num2, num3));
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		if (num == num2 && num == num3 && num2 == num3) {
//			answer += 10000 + (num * 1000);
//		}
//		else if (num == num2 || num == num3) {
//			answer += 1000 + (num * 100);
//		}
//		else if (num2 == num3) {
//			answer += 1000 + (num2 * 100);
//		}
//		else {
//			int max = Math.max(num, num2);
//			max = Math.max(max, num3);
//			answer += max * 100;
//		}
//		
//		System.out.println(answer);
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		if (num == num2 && num == num3 && num2 == num3) {
			answer += 10000 + (num * 1000);
		}
		else if (num == num2 || num == num3) {
			answer += 1000 + (num * 100);
		}
		else if (num2 == num3) {
			answer += 1000 + (num2 * 100);
		}
		else {
			int max = Math.max(num, num2);
			max = Math.max(max, num3);
			answer += max * 100;
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
