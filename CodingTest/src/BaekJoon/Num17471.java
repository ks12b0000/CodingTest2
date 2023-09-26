package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num17471 {
	static int n;
	static int[] peoples;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static boolean[] check;
	static boolean[] visit;
	static int answer = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		peoples = new int[n];
		check = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			peoples[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < n; i++) {
			int idx = sc.nextInt();
			for (int j = 0; j < idx; j++) {
				int num = sc.nextInt();
				list.get(i).add(num - 1);
			}
		}
		
		divide(0);
		
		if (answer == Integer.MAX_VALUE) {
			answer = -1;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
	static void divide(int idx) {
		if (idx == n) {
			ArrayList<Integer> aList = new ArrayList<>();
			ArrayList<Integer> bList = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				if (check[i]) {
					aList.add(i);
				}
				else {
					bList.add(i);
				}
			}
			if (aList.size() == 0 || bList.size() == 0) return;
			if (connection(aList) && connection(bList)) {
				int a = 0;
				int b = 0;
				for (int i = 0; i < n; i++) {
					if (check[i]) {
						a += peoples[i];
					}
					else {
						b += peoples[i];
					}
				}
				answer = Math.min(answer, Math.abs(a - b));
			}
			return;
		}
		check[idx] = true;
		divide(idx + 1);
		check[idx] = false;
		divide(idx + 1);
	}
	static boolean connection(ArrayList<Integer> connect) {
		Queue<Integer> queue = new LinkedList<>();
		visit = new boolean[n];
		visit[connect.get(0)] = true;
		queue.add(connect.get(0));
		
		int cnt = 1;
		
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			for (int i = 0; i < list.get(tmp).size(); i++) {
				int num = list.get(tmp).get(i);
				if (connect.contains(num) && !visit[num]) {
					queue.add(num);
					visit[num] = true;
					cnt++;
				}
			}
		}
		if (cnt == connect.size()) {
			return true;
		}
		return false;
	}
}
