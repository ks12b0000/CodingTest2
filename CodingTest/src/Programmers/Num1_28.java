package Programmers;

import java.util.Scanner;

public class Num1_28 {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
        	answer += a[i] * b[i]; // answer에 a[i] * b[i] 를 더해줌.
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_28 T = new Num1_28();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[num];
		for (int i = 0; i < num; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
