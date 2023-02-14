package Programmers;

import java.util.Arrays;
import java.util.Scanner;


public class Num0_31 {

	// 방법1 
//	public int solution(String before, String after) {
//        int answer = 0;
//        int num = 0;
//
//        String[] beforeArr = before.split(""); // before를 String배열에 담아줌
//        String[] afterArr = after.split(""); // after를 String배열에 담아줌
//        Arrays.sort(beforeArr); // 정렬해줌
//        Arrays.sort(afterArr); // 정렬해줌
// 
//        for (int i = 0; i < beforeArr.length; i++) { 
//        	if (beforeArr[i].equals(afterArr[i])) { // after, before 둘 다 정렬 했으면 같으면 같은 자리 수 값이 같아야함.
//        		num++; // 같으면 num 증가
//        	}
//        }
//        if (num == before.length()) { // num이 before,after 길이랑 같으면 순서를 바꿔서 만들 수 있는 값이므로 1 출력
//        	answer = 1;
//        }
//        else { // 아니면 0 출력
//        	answer = 0;
//        }
//        
//        return answer;
//    }
	
	// 방법2
	public int solution(String before, String after) {
		int answer = 0;
		
		char[] beforeArr = before.toCharArray(); // before를 char 배열에 담아줌
		char[] afterArr = after.toCharArray(); // after를 char 배열에 담아줌
		Arrays.sort(beforeArr); // 정렬해줌
		Arrays.sort(afterArr); // 정렬해줌
		
		if (String.valueOf(beforeArr).equals(String.valueOf(afterArr))) { // 만약 beforeArr을 String으로 변환한 값이랑 afterArr을 String으로 변환한 값이랑 같으면
			answer = 1; // answer = 1
		}
		else { // 아니면 answer = 0
			answer = 0;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num0_31 T = new Num0_31();
		Scanner sc = new Scanner(System.in);
		String brfore = sc.next();
		String after = sc.next();
		System.out.println(T.solution(brfore, after));
		sc.close();
	}
}
