package Programmers;

import java.util.Scanner;

public class Num1_14 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        int num = n; 
        while (n >= a) { // n값이 a랑 같거나 크면 반복(병을 바꿀 수 있는 개수여야 함.)
        	answer += (n / a) * b; // answer += (n / a) * b를 해주면 받은 병의 개수를 구할 수 있음.
        	n = ((n / a) * b) + (n % a); // 남은개수 n = 받은개수 ((n / a) * b) + 병을 바꾸고 남은개수 (n % a) 해주면 남은 개수가 나옴.
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_14 T = new Num1_14();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(T.solution(a, b, n));
		sc.close();
	}
}
