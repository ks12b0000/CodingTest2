package Programmers;

import java.util.Scanner;

public class Num1_23 {
	public int solution(String s) {
        int answer = 0; // num 배열에 0 ~ 9 까지 영문으로 저장.
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for (int i = 0; i < num.length; i++) { 
        	s = s.replaceAll(num[i], Integer.toString(i)); // s = s에서 num[i]에 있는 값이 있으면 i값을 String으로 변환 후 저장.
        }
        
        answer = Integer.parseInt(s); // s값을 int로 변환 후 answer에 넣어줌.
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_23 T = new Num1_23();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
		sc.close();
	}
}
