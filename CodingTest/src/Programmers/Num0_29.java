package Programmers;

import java.util.Scanner;

public class Num0_29 {
	public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) { // 만약 my_string에서 my_string(i)번째 문자값을 찾았을 때 i번째 위치에 있으면 answer에 넣어줌
				answer += my_string.charAt(i);
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_29 T = new Num0_29();
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		System.out.println(T.solution(my_string));
		sc.close();
	}
}
