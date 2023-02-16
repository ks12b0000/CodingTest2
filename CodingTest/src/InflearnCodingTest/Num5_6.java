package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num5_6 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>(); // Queue는 First In First Out
		
		for (int i = 1; i <= n; i++) { // 1 ~ n까지 queue에 값을 넣어줌
			queue.offer(i);
		}
		
		while (!queue.isEmpty()) { // queue가 비어있지 않으면 반복
			for (int i = 1; i < k; i++) { // 1 ~ k전까지
				queue.offer(queue.poll()); // 맨 앞에 있는 값을 꺼내서 다시 queue에 넣어준다(뒤로 이동)
			}
			queue.poll(); // k를 외치면 지워줌.
			if (queue.size() == 1) { // queue의 사이즈가 1이 되면
				answer = queue.poll(); // answer에 queue값을 넣어준다.
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num5_6 T = new Num5_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
		sc.close();
	}

}
