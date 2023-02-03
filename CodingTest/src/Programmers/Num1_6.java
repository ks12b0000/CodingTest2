package Programmers;

import java.util.Scanner;

public class Num1_6 {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1; // s의 0번째 자리의 앞자리 값이 없으므로 무조건 answer[0]은 -1이 됨.
        
        for (int i = 1; i < s.length(); i++) { // ex) s = banana 일 때 
        	int x = s.lastIndexOf(s.substring(i, i + 1), i - 1); // lastIndexOf는 원본 문자열의 뒤에서부터 탐색해서 처음으로 파라미터의 문자열이 나오는 index를 리턴함
 // s.substring(1, 2) = a, i - 1 = 0, 0번째 자리의 a가 없으므로 -1
 // s.substring(2, 3) = n, i - 1 = 1, 0,1번째 자리의 n이 없으므로 -1
 // s.substring(3, 4) = a, i - 1 = 2, 0,1,2번째 자리 ban 에서 뒤에서부터 a를 찾았을 때 index 1번째 자리에 있음 answer[3] = 3 - 1 = 2
 // s.substring(4, 5) = n, i - 1 = 3, 0,1,2,3번째 자리 bana 에서 뒤에서부터 n를 찾았을 때 index 2번째 자리에 있음 answer[4] = 4 - 2 = 2
 // s.substring(5, 6) = a, i - 1 = 4, 0,1,2,3,4번째 자리 banan 에서 뒤에서부터 a를 찾았을 때 index 3번째 자리에 있음 answer[5] = 5 - 3 = 2
        	if (x == -1) {
        		answer[i] = x;
        	}
        	else {
        		answer[i] = i - x; 
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_6 T = new Num1_6();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int x : T.solution(s)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
