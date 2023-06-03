package BaekJoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Num1715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int answer = 0;
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}
		
		while (queue.size() > 1) {
			int a = queue.poll();
			int b = queue.poll();
			
			answer += a + b;
			queue.add(a + b);
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
