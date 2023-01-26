package Programmers;

import java.util.Scanner;

public class Num0_3 {
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for (int i = 0; i < num; i++) {
        	total += answer[i];
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_3 T = new Num0_3();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = sc.nextInt();
		System.out.println(T.solution(num, total));
		sc.close();
	}
}
