package Programmers;

import java.util.Scanner;

public class Num1_9 {
	public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
        	int cnt = 0;
        	for (int j = 1; j * j <= i; j++) {
        		if (j * j == i) {
        			cnt++;
        		}
        		else if (i % j == 0) {
        			cnt += 2;
        		}
        	}
        	if (cnt > limit) {
        		cnt = power;
        	}
        	answer += cnt;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_9 T = new Num1_9();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int limit = sc.nextInt();
		int power = sc.nextInt();
		System.out.println(T.solution(number, limit, power));
		sc.close();
	}
}
