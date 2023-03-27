package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Num1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		Deque<Integer> deque = new LinkedList<>();
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			deque.add(i);
		}
		
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			int idx = ((LinkedList<Integer>) deque).indexOf(a);
			int mid;
			
			if(deque.size() % 2 == 0) {
				mid = deque.size() / 2 - 1;
			}
			else {
				mid = deque.size() / 2;
			}
			
			if (idx <= mid) {
				for (int j = 0; j < idx; j++) {
					deque.addLast(deque.pollFirst());
					cnt++;
				}
			}
			else {
				for (int k = 0; k < deque.size() - idx; k++) {
					deque.addFirst(deque.pollLast());
					cnt++;
				}
			}
			deque.pollFirst();
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}	
