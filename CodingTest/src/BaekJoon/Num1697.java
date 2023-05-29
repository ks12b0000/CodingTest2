package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1697 {
	static int n, k;
	static int[] ch = new int[100001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		if (n == k) {
			System.out.println(0);
		}
		else {
			System.out.println(BFS());
		}		
		
		sc.close();
	}
	static int BFS() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(n);
		ch[n] = 1;

		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			
			for (int i = 0; i < 3; i++) {
				int next;
				if (i == 0) {
					next = tmp + 1;
				}
				else if (i == 1) {
					next = tmp - 1;
				}
				else {
					next = tmp * 2;
				}
				if (next == k) {
					return ch[tmp];
				}
				if (next >= 0 && next < 100001 && ch[next] == 0) {
					ch[next] = ch[tmp] + 1;
					queue.add(next);
				}
			}
		}
		return 0;
	}
}
