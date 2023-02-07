package Programmers;

import java.util.Scanner;

public class Num1_9 {
	public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) { 
        	int cnt = 0;
        	// 약수를 구하는 반복문을 반으로 줄임.
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
        
        // ex) number = 5일 때 
        // i = 1, cnt = 0, j = 1, j * j = i Oc/ cnt = 1
        // i = 2, j = 1, 1 * 1 <= 2, 1 * 1 = 2 x / cnt = 2
        // i = 3, j = 1, 1 * 1 <= 3, 1 * 1 = 3 x / cnt = 2
        // i = 4, j = 1, 1 * 1 <= 4, 1 * 1 = 4 x / cnt = 2 / 2 * 2 <= 4, 2 * 2 = 4 cnt = 3
        // i = 5, j = 1, 1 * 1 <= 5, 1 * 1 = 5 x / cnt = 2 / 2 * 2 <= 4, 2 * 2 = 5 x, 5 % 2 == 0 x
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
