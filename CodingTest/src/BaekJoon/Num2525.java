package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2525 {
	
	
	
	/* 프로그래머스 방식 */
//	public String solution(int num, int num2, int num3) {
//		String answer = "";
//		
//		int time = num * 60 + num2 + num3;				// 현재 시(시 * 60 하면 분 구함.), 분, 더해야 할 시간 을 다 더해줘서 분으로 만듦.
//		
//		num = time / 60;								// 다 더한 분을 60 으로 나누면 시 가 나오고.
//		num2 = time % 60;								// 다 더한 분을 60 으로 나눠서 나온 나머지가 분이됨.
//		
//		if (num > 23) {									// 만약 시 가 23 을 넘어가면 num - 24 해줌.
//			num = num - 24;
//		}
//		
//		answer += num + " " + num2; 
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num2525 T = new Num2525();
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
//		
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int time = num * 60 + num2 + num3;
//		
//		num = time / 60;
//		num2 = time % 60;
//		
//		if (num > 23) {
//			num = num - 24;
//		}
//		
//		System.out.println(num + " " + num2);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(br.readLine());
		
		int time = num * 60 + num2 + num3;
		
		num = time / 60;
		num2 = time % 60;
		
		if (num > 23) {
			num = num - 24;
		}
		
		System.out.println(num + " " + num2);
		
		br.close();
	}

}
