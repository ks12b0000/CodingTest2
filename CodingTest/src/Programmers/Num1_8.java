package Programmers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Num1_8 {
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            q.add(score[i]); // PriorityQueue(우선순위 큐)에 score[i] 값을 넣어줌.
            if (q.size() > k) { // PriorityQueue(우선순위 큐) 사이즈가 k 보다 크면
                q.poll();  // 우선순위가 제일 높은 수를 지워줌. (제일 낮은 숫자)
            }
            answer[i] = q.peek(); // answer[i]에 우선순위가 가장 높은 값을 저장(제일 낮은 숫자)
        }
        return answer;
    }
	public static void main(String[] args) {
		Num1_8 T = new Num1_8();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] score = new int[7];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		for (int x : T.solution(k, score)) {
			System.out.print(x + " ");
		}
		sc.close();
	}

}
