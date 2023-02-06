package Programmers;

import java.util.Scanner;

public class Num1_7 {
	public int solution(String s) {
        int answer = 0;
        int right = 0;
        
        while (right < s.length()) {	// right가 s.length 보다 작을경우 반복
        	char c = s.charAt(right);	// char c 에 s의right자리 문자를 저장
        	int cCount = 1;				// 같은 문자 count를 나 자신도 포함해서 1로 저장
        	int otherCount = 0;			// 다른 문자는 0으로 저장
        	while (right + 1 < s.length() && cCount != otherCount) {	// right + 1이 s.length 보다 작거나 같은문자랑 다른문자의 개수랑 다르면
        		right++; // right 1증가
        		if (s.charAt(right) == c) { // s의 rigth자리 문자가 c문자랑 같으면 같은문자 1증가
					cCount++;
				}	
        		else { // 아니면 다른문자 1증가
        			otherCount++;
        		}
        	}
        	answer++; // 반복문 돌 때 마다 answer 1증가
        	right++;  // right 1증가
        }
        
        return answer;
        // ex) s = "banana"이면 일단 right = 0이므로 첫번째 while문 동작
        // cCount = 1, otherCount = 0이므로 두번째 while문 동작 
        // c = 'b', right = 1 s의 1자리 문자랑 c랑 다르므로 otherCount = 1 / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료
        // answer = 1, right = 2 
        
        // right = 2이므로 첫번째 while문 동작
        // c = 'n',cCount = 1, otherCount = 0이므로 두번째 while문 동작 
        // right = 3 s의 3자리 문자랑 c랑 다르므로 otherCount = 1 / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료
        // answer = 2, right = 4 
        
        // right = 4이므로 첫번째 while문 동작
        // c = 'n',cCount = 1, otherCount = 0이므로 두번째 while문 동작 
        // right = 5 s의 5자리 문자랑 c랑 다르므로 otherCount = 1 / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료
        // answer = 3, right = 6        
        // right < s.length() 가 맞지 않으므로 모든 실행 종료
        
        
        
        // ex.) s = aaabbaccccabba 이면 일단 right = 0이므로 첫번째 while문 동작
     	// 두번째 while문 동작 c = 'a' right = 1 s의 1자리 문자랑 c랑 같으므로 cCount = 2,
        // right = 2 s의 2자리 문자랑 c랑 같으므로 cCount = 3, right = 3 , s의 3자리 문자랑 c랑 다르므로 otherCount = 1,
     	// right = 4 s의 4자리 문자랑 c랑 다르므로 otherCount = 2, right = 5, s의 5자리 문자랑 c랑 같으므로 cCount = 4, 
        // right = 6 s의 6자리 문자랑 c랑 다르므로 otherCount = 3 
     	// right = 7 s의 7자리 문자랑 c랑 다르므로 otherCount = 4  / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료 aaabbacc까지 끊기고 
        // answer = 1 right = 8

        // right = 8이므로 첫번째 while문 동작
     	// c = 'c' right = 9  s의 9자리 문자랑 c랑 같으므로 cCount = 2, right = 10 s의 10자리 문자랑 c랑 다르므로 otherCount = 1
     	// right = 11, s의 11자리 문자랑 c랑 다르므로 otherCount = 2  / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료 ccab까지 끊기고 
        // answer = 2 right = 12
        
        // right = 12이므로 첫번째 while문 동작
     	// c = 'b' right = 13 s의 13자리 문자랑 c랑 다르므로 otherCount = 1  / 두번째 반복문에서 cCount != otherCount에 맞지 않으므로 종료 ba까지 끊기고 
        // answer = 3 right = 14
        // right < s.length() 가 맞지 않으므로 모든 실행 종료
    }
	public static void main(String[] args) {
		Num1_7 T = new Num1_7();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
		sc.close();
	}
}
