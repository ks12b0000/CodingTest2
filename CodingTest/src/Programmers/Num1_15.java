package Programmers;

import java.util.Scanner;

public class Num1_15 {
	public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length - 2; i++) { // 모든 수를 3개씩 더해봐서 0이 나오면 answer++
        	for (int j = i + 1; j < number.length - 1; j++) {
        		for (int k = j + 1; k < number.length; k++) {
        			if (number[i] + number[j] + number[k] == 0) {
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_15 T = new Num1_15();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] number = new int[num];
		for (int i = 0; i < num; i++) {
			number[i] = sc.nextInt();
		}
		System.out.println(T.solution(number));
		sc.close();
	}
}
