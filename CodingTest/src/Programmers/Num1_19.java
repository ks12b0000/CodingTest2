package Programmers;

import java.util.Scanner;

public class Num1_19 {
	public int solution(int n) {
		int answer = 0;
	        
		for (int i = 1; i < n; i++) { // 1 ~ n 전까지
			if (n % i == 1) { // n % 1 ~ n전까지 했을 때 1이 나오면 answer에 i를 넣어주고 종료해준다.(가장 작은 자연수 출력)
				answer = i;
				break;
			}
		}
	        
		return answer;
	}
	public static void main(String[] args) {
		 Num1_19 T = new Num1_19();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println(T.solution(n));
		 sc.close();
	}
}
