package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num2644 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static boolean[] visit;
	static int answer = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int people1 = sc.nextInt();
		int people2 = sc.nextInt();
		int m = sc.nextInt();
		visit = new boolean[n + 1];
		
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		
		
		findGraph(people1, people2, 0);
		
		System.out.println(answer);
				
		
		sc.close();
	}
	static void findGraph(int start, int end, int cnt) {	
		if (start == end) {
			answer = cnt;
			return;
		}
		
		visit[start] = true;
		for (int next : graph.get(start)) {
			if (!visit[next]) {
				findGraph(next, end, cnt + 1);
			}
		}
		
	}
}
