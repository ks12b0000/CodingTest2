package Programmers;

import java.util.Scanner;

public class Num0_13 {
	public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);			// int n 을 String으로 변환해서 str에 저장해줌
        
        for (int i = 0; i < str.length(); i++) {
        	answer += Character.getNumericValue(str.charAt(i));		// answer에 str i번째 문자를 숫자로 변환해서 더해줌
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_13 T = new Num0_13();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		sc.close();
	}
}
