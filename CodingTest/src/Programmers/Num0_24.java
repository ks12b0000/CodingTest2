package Programmers;

import java.util.Scanner;

public class Num0_24 {
	public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split(""); // arr배열에 my_string을 한문자씩 담아주고
        
        for (int i = 0; i < my_string.length(); i++) {
        	if (my_string.charAt(i) < 97) { // my_string(i)번째 값이 97보다 작으면(아스키 코드로 대문자 = 65 ~ 90) answer에 arr[i]를 소문자로 변환해서 넣어줌
        		answer += arr[i].toLowerCase();
        	}
        	else { // my_string(i)번째 값이 97보다 크면(아스키 코드로 소문자 = 97 ~ 122) answer에 arr[i]를 대문자로 변환해서 넣어줌
        		answer += arr[i].toUpperCase();
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_24 T = new Num0_24();
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		System.out.println(T.solution(my_string));
		sc.close();
	}
}
