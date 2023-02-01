package Programmers;

import java.util.Scanner;

public class Num0_11 {
	public int solution(String str1, String str2) {
        int answer = 0;
        
//        int A = str1.indexOf(str2);		// str1 안에 str2 문자열이 어디에 있는지 indexOf로 찾았고
//        
//        if (A > -1) {					// -1 보다 크면(-1 이면 못찾았기 때문) 1을 return 해줌
//        	answer = 1;
//        }
//        else {							// -1 이면 2 return
//        	answer = 2;
//        }
        
//        if (str1.contains(str2)) {			// contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
//        	answer = 1;						// str1 안에 str2 문자열이 포함 되어 있으면 true 없으면 false
//        }
//        else {
//        	answer = 2;
//        }
        
        answer = (str1.contains(str2) ? 1 : 2);	// 3항 연산자를 사용하여 한줄로 줄여줄 수 있다.
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_11 T = new Num0_11();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str1, str2));
		sc.close();
	}
}
