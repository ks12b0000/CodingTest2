package DoitBook;

import java.util.Arrays;
import java.util.Scanner;

public class Num002 {
	public double solution (int num, int[] num2) {
		double answer = 0.0;
		Arrays.sort(num2); // num2 배열을 정렬해주고
		double max = num2[num2.length - 1]; // 배열 마지막에 있는 값이 가장 큰 수 
		
		for (int i = 0; i < num2.length; i++) {
			answer += (num2[i] / max) * 100; // answer에 num2[i] / max * 100 한 값을 다 더해줌 (고친 점수)
		}
		answer = answer / num; // 마지막으로 answer / num 하면 고친 점수에서 평균 나옴
		
		return answer;
	}
	public static void main(String[] args) {
		Num002 T = new Num002();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] num2 = new int[num];
		for (int i = 0; i < num; i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println(T.solution(num, num2));
		sc.close();
	}

}
