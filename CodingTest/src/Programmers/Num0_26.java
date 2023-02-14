package Programmers;

import java.util.Scanner;

public class Num0_26 {
	public int solution(int order) {
        int answer = 0;
        
        String str = Integer.toString(order); // order를 String으로 변환 후 str에 저장
        
        for (int i = 0; i < str.length(); i++) {
        	if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') { // 만약 str의 i번째 문자가 3,6,9가 나오면 answer증가
        		answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_26 T = new Num0_26();
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		System.out.println(T.solution(order));
		sc.close();
	}
}
