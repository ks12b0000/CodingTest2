package Programmers;

import java.util.Scanner;

public class Num0_25 {
	public String solution(String cipher, int code) {
        String answer = "";
        int num = code; // num에 code를 넣어주고
        for (int i = 0; i < cipher.length() / code; i++) { // 0 ~ cipher의 길이 / code 전 만큼
        	answer += cipher.charAt(num - 1); // answer에 cipher(num - 1)문자를 넣어줌(우리는 문자열을 0부터 시작하지만 문제는 1부터 시작함)
        	num += code; // for문 돌때마다 num += code해줌 (배수)
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_25 T = new Num0_25();
		Scanner sc = new Scanner(System.in);
		String cipher = sc.next();
		int code = sc.nextInt();
		System.out.println(T.solution(cipher,code));
		sc.close();
	}
}
