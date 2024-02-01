package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num5014 {
	static boolean[] visit;
	static int[] tmp;
	static int[] dir = new int[2];
	static int F, S, G, U, D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		F = sc.nextInt();
		S = sc.nextInt();
		G = sc.nextInt();
		U = sc.nextInt();
		D = sc.nextInt();
		visit = new boolean[F + 1];
		tmp = new int[F + 1];
		dir[0] = U;
		dir[1] = -D;
		
		bfs(S);	
		
		sc.close();
	}
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visit[start] = true;
		queue.add(start);
		
		while (!queue.isEmpty()) {
			int num = queue.poll();
			
			if (num == G) {
				System.out.println(tmp[num]);
				return;
			}
			
			for (int i = 0; i < 2; i++) {
				int next = num + dir[i];
				
				if (next <= F && next > 0 && !visit[next]) {
					visit[next] = true;
					queue.add(next);
					tmp[next] = tmp[num] + 1;
				}
			}		
		}
		System.out.println("use the stairs");
	}
}
