package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println(BFS(s, e));
		
		sc.close();
	}
	static int BFS(int s, int e) {
		int[] dis = {1, -1, 5};
		boolean[] ch = new boolean[10001];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int answer = 0;
		ch[s] = true;
		queue.offer(s);
		
		while (!queue.isEmpty()) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				int x = queue.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if (nx == e) {
						return answer + 1;
					}
					if (nx >= 1 && nx <= 10000 && !ch[nx]) {
						ch[nx] = true;
						queue.offer(nx);
					}
				}
			}
			answer++;
		}
		
		
		return 0;
	}
}
