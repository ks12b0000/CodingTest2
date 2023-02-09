package Programmers;

import java.util.Scanner;

public class Num1_27 {
	public String solution(String new_id) {
        String answer = new_id; // new_id를 answer에 저장
        
        answer = answer.toLowerCase().replaceAll("[^a-z0-9_.-]", "") // answer를 소문자로 변환하고 알파벳,숫자,_,.,- 아닌 문자들 다 지워줌
        		.replaceAll("[.]+", "."); // .이 2개이상 있으면 .으로 바꿔줌
        if (answer.startsWith(".")) { // 처음 문자가 . 이면 지워줌
        	answer = answer.replaceFirst(".", "");
        }
        if (answer.endsWith(".")) { // 마지막 문자가 . 이면 지워줌
        	answer = answer.substring(0, answer.length() - 1);
        }
        if (answer.isEmpty()) { // answer 길이가 0이면 a 넣어줌
        	answer = "a";
        }
        if (answer.length() > 15) { // answer의 길이가 15보다 크면
        	answer = answer.substring(0, 15); // 0 ~ 15까지 잘라줌.
        	if (answer.endsWith(".")) { // 마지막 문자가 . 이면 지워줌.
        		answer = answer.substring(0, answer.length() - 1);
        	}
        }
        if (answer.length() <= 2) { // answer의 길 이가 2랑 같거나 작으면
        	char x = answer.charAt(answer.length() - 1); // 마지막 문자를 x에 저장해주고
        	while (answer.length() <= 2) { // answer의 길이가 2랑같거나 작으면 answer에 x를 넣어줌
            	answer += x;
            }
        }        
        return answer;
    }
	public static void main(String[] args) {
		Num1_27 T = new Num1_27();
		Scanner sc = new Scanner(System.in);
		String new_id = sc.next();
		System.out.println(T.solution(new_id));
		sc.close();
	}
}

