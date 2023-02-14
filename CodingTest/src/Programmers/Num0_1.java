package Programmers;

import java.util.Scanner;

public class Num0_1 {
	public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", ""); // babbling[i]에서 aya|ye|woo|ma 를 찾으면 ""로 바꿈
            if (babbling[i].length() == 0) { // babbling[i]의 길이가 0이나오면 answer증가
            	answer++;
            }
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_1 T = new Num0_1();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] babbling = new String[num];
		for (int i = 0; i < num; i++) {
			babbling[i] = sc.next();
		}
		System.out.println(T.solution(babbling));
		sc.close();
	}
}
