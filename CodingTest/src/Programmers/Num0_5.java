package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num0_5 {
//	public int solution(String A, String B) {		// ex) A = "hello", B = "ohell"
//        int answer = 0;
//        String result = A;							// result = "hello"
//        
//        for (int i = 0; i < A.length(); i++) {		
//        	if (result.equals(B)) {					// 만약 result = "ohell" 이면 answer 출력
//        		return answer;
//        	}
//        	String a = result.substring(result.length() - 1);		// a = "hello"에서 4번째 자리 "o" 를 저장시켜주고
//            result = a + result.substring(0, result.length() - 1);	// result에 "o" + "hell"("hello"에서 0 ~ 3번째 자리까지 가져옴)
//            answer++;												// 한번씩 바꿀때 마다 answer 1증가
//        }															// A.length 만큼 바꿨는데 B랑 같지 않으면 -1 출력
//        
//        return -1;
//    }
	public int solution(String A, String B) {
        return (B + B).indexOf(A);				// ex) A = "hello" B = "ohell" 일 때 "ohellohell"에서 A문자열 찾으면 1번째 자리 나
    }
//	public static void main(String[] args) {
//		Num0_5 T = new Num0_5();
//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		String B = sc.next();
//		System.out.println(T.solution(A, B));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_5 T = new Num0_5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		System.out.println(T.solution(A, B));
		br.close();
	}
}
