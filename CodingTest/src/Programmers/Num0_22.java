package Programmers;

import java.util.Scanner;

public class Num0_22 {
	public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
        	if (i == num1) { // i 가 num1 값이랑 같으면
        		answer += my_string.charAt(num2); // answer에 my_string(num2)번째 문자를 넣어줌
        	}
        	else if (i == num2) { // i가 num2랑 값이랑 같으면
        		answer += my_string.charAt(num1); // answer에 my_string(num1)번째 문자를 넣어줌
        	}
        	else { // 둘 다 아니면 my_string(i) 번째 문자를 넣어줌
        		answer += my_string.charAt(i);
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_22 T = new Num0_22();
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(T.solution(my_string, num1, num2));
		sc.close();
	}
}
