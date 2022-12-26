package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num1_10 {
	
	
	
	/* 프로그래머스 방식 */
//	public int[] solution(String str, char str2) {
//		int[] answer = new int[str.length()];		// int 배열 answer에 str길이만큼 담아줌.
//		int p = 1000;								// 첫번째 값은 왼쪽에 값이 없으므로 오른쪽 값을 찾을 때 넉넉히 찾아줄 수 있게 1000으로 잡음.
//		
//		for (int i = 0; i < str.length(); i++) {	// str 길이만큼 오른쪽 값에 같은 값 검증
//			if (str.charAt(i) == str2) {			// 만약 str의 i번째 문자가 str2에 입력한 문자랑 같으면 
//				p = 0;								// p를 0으로 바꿔주고
//				answer[i] = p;						// answer 배열에 값에 p를 넣어줌.
//			}
//			else {									// str의 i번째 문자가 str2에 입력한 문자랑 다르면
//				p++;								// p의 값을 1 증가시켜주고 
//				answer[i] = p;						// answer 배열에 값에 p를 넣어줌.
//			}
//		}
//		p = 1000;									// 왼쪽 값을 검증하기 위해 다시 p를 1000으로 바꿔주고
//		
//		for (int i = str.length()-1; i >= 0; i--) {		// str문자 길이만큼 맨 끝에서 부터 왼쪽으로 검증.
//			if (str.charAt(i) == str2) {				// 만약 str i번째 문자가 str2에 입력한 문자랑 같으면
//				p = 0;									// p를 0으로 만들어줌. answer에 안담은 이유는 위에 검증에서 같으면 이미 0을 담아놨음.
//			}
//			else {									// str i번째 문자가 str2에 입력한 문자랑 다르면
//				p++;								// p를 1증가 시켜주고.
//				answer[i] = Math.min(answer[i], p);	// answer 배열에 값에 기존에 넣어둔 answer 배열값이랑 현재 p값이랑 비교해서 더 작은 값을 넣어줌.
//			}
//		}
//		
//		
//		return answer;
//	}
//	public static void main (String [] args) {
//		Num1_10 T = new Num1_10();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		char str2 = sc.next().charAt(0);
//		for (int x : T.solution(str, str2)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	

	
	/* 백준 방식1 */
//	public static void main (String [] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		char str2 = sc.next().charAt(0);
//		
//		int[] answer = new int[str.length()];
//		
//		int p = 1000;
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == str2) {
//				p = 0;
//				answer[i] = p;
//			}
//			else {
//				p++;
//				answer[i] = p;
//			}
//		}
//		
//		p = 1000;
//		
//		for (int i = str.length() -1; i >= 0; i--) {
//			if (str.charAt(i) == str2) {
//				p = 0;
//			}
//			else {
//				p++;
//				answer[i] = Math.min(answer[i], p);
//			}
//		}
//		
//		for (int x : answer) {					// 지금까지 넣어줬던 answer를 int x에 담아서 출력해줌.
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str = st.nextToken();
		char str2 = st.nextToken().charAt(0);
		
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str2) {
				p = 0;
				answer[i] = 0;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == str2) {
				p = 0;
			}
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		} 
		
		br.close();
	}

}
