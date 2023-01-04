package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2884 {
	
	
	/* 프로그래머스 방식 */
//	public String solution(int num, int num2) {
//		String answer = "";
//		
//		if (num2 < 45) {
//			num--;
//			num2 = 60 - (45-num2);
//			if (num < 0) {
//				num = 23;			
//			}
//			answer = num + " " + num2;
//		}
//		else {
//			answer = num + " " + (num2 - 45);
//		}
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2884 T = new Num2884();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(T.solution(num, num2));
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer = "";
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if (num2 < 45) {		 	// 만약 분이 45분 보다 작으면 시 를 -1 해주고 분을 60 - (45 - num2값을) 해줌.
//			num--;
//			num2 = 60 - (45 - num2);
//			if (num < 0) {			// 만약 시 가 0 보다 작으면 시는 23으로 해줌.
//				num = 23;			
//			}
//			answer = num + " " + num2;
//		}
//		else {
//			answer = num + " " + (num2 - 45);		// 위에 검증들이 아니면 분을 - 45해서 출력해줌.
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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		if (num2 < 45) {		 	
			num--;
			num2 = 60 - (45 - num2);
			if (num < 0) {			
				num = 23;			
			}
			answer = num + " " + num2;
		}
		else {
			answer = num + " " + (num2 - 45);		
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
