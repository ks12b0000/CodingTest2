package Programmers;

import java.util.Scanner;

public class Num1_22 {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
        	sum += price * i; // sum에 price를 1번 타면 * 1 2번 타면 * 2 해줌.
        }
        
        if (sum - money < 0) { // 금액이 부족하지 않으면 0출력
        	answer = 0;
        }
        else {
        	answer = sum - money; // 부족하면 sum - money해줌.
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_22 T = new Num1_22();
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = sc.nextInt();
		int count = sc.nextInt();
		System.out.println(T.solution(price, money, count));
		sc.close();
	}
}
