package Programmers;

import java.util.Scanner;

public class Num0_23 {
	public long solution(String numbers) {
        long answer = 0;
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"}; // 배열에 0~9까지 문자들 담아줌
        
        for (int i = 0; i < str.length; i++) {
        	numbers = numbers.replaceAll(str[i], String.valueOf(i)); // numbers에 str[i]가 있으면 i를 String으로 변환해서 numbers에서 바꿔줌
        }
        
        answer = Long.parseLong(numbers); // numbers를 Long으로 변환
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_23 T = new Num0_23();
		Scanner sc = new Scanner(System.in);
		String numbers = sc.next();
		System.out.println(T.solution(numbers));
		sc.close();
	}
}
