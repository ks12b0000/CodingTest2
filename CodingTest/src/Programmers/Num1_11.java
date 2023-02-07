package Programmers;

import java.util.Scanner;

public class Num1_11 {
	public String solution(int[] food) { // ex) food = [1, 7, 1, 2]
        String answer = "";        
        
        for (int i = 1; i < food.length; i++) { // 1 ~ food의 길이 전 까지. / 1 ~ 3
        	for (int j = 0; j < food[i] / 2; j++) { // 0 ~ food[i] 값 나누기 2 까지 / food[1] / 2 = 3, food[2] / 2 = 0, food[3] / 2 = 1
            	answer += i; // answer += i / 1을 3번 넣어줌, 3을 1번 넣어줌. answer = 1113
            }
        }
        StringBuffer sb = new StringBuffer(answer); // StringBuffer에 answer 값을 담아주고 
        String reversedStr = sb.reverse().toString(); // answer값을 뒤집어서 저장해줌. reversedStr = 3111
 
        answer += "0" + reversedStr; // answer += "0" + answer 뒤집은 값 "1113" + "0" + "3111"
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_11 T = new Num1_11();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] food = new int[num];
		for (int i = 0; i < num; i++) {
			food[i] = sc.nextInt();
		}
		System.out.println(T.solution(food));		
		sc.close();
	}
}
