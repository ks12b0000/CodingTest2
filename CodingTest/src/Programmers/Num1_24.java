package Programmers;

import java.util.Scanner;

public class Num1_24 {
	public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) { // left ~ right 까지 
        	int num = 0; 
        	for (int j = 1; j <= i; j++) { // 1 ~ i까지
        		if (i % j == 0) { // i % j == 0 이 나오면 약수임 약수 나올 때 마다 num++
        			num++;
        		}
        	}
        	if (num % 2 == 0) { // 만약 약수의 개수가 짝수면 answer에 i를 더해주고
        		answer += i;
        	}
        	else { // 홀수면 answer에 i를 빼준다.
        		answer -= i;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_24 T = new Num1_24();
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		System.out.println(T.solution(left, right));
		sc.close();
	}
}
