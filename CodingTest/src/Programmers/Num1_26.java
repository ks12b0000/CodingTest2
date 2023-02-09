package Programmers;

import java.util.Scanner;

public class Num1_26 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) { // signs[i]번째 값이 true면 answer에 absolutes[i] 값을 더해줌.
                answer += absolutes[i];
            }
            else { // signs[i]번째 값이 false면 answer에 absolutes[i] 값을 빼줌.
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_26 T = new Num1_26();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] absolutes = new int[num];
		for (int i = 0; i < num; i++) {
			absolutes[i] = sc.nextInt();
		}
		boolean[] signs = new boolean[num];
		for (int i = 0; i < num; i++) {
			signs[i] = sc.nextBoolean();
		}
		System.out.println(T.solution(absolutes, signs));
		sc.close();
	}
}
