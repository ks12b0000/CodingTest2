package Programmers;

import java.util.Scanner;

public class Num1_21 {
	public int solution(int[] numbers) {
		// 방법1
//        int answer = 0;
//        String numbersStr = "";
//        for (int i = 0; i < numbers.length; i++) {
//        	numbersStr += numbers[i]; // numbers를 String으로 저장
//        }
//        
//        for (int j = 0; j <= 9; j++) {
//        	if (numbersStr.contains(String.valueOf(j)) == false) { // numbersStr에 j를 문자로 바꾼 값이 없으면
//        		answer += j; // answer += j를 해준다.
//        	}
//        }
        
		// 방법2
        int answer = 45; // 0 ~ 9 까지 더한 값 1 2 3 4 5 6 7 8 9
        
        for (int x : numbers) { // x에 numbers를 넣어주면서 있는 값들을 answer -= x 해줌.
        	answer -= x;
        }
                
        return answer;
    }
	public static void main(String[] args) {
		Num1_21 T = new Num1_21();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numbers = new int[num];
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(T.solution(numbers));
		sc.close();
	}
}
