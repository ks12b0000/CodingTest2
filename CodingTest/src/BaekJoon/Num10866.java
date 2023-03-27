package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Num10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			
			if (a.contains("push_front")) {
				String b = a.substring(11);
				deque.addFirst(Integer.parseInt(b));
			}
			else if (a.contains("push_back")) {
				String b = a.substring(10);
				deque.addLast(Integer.parseInt(b));
			}
			else if (a.equals("pop_front")) {
				if (deque.isEmpty()) sb.append(-1 + "\n");
				else sb.append(deque.pollFirst() + "\n");
			}
			else if (a.equals("pop_back")) {
				if (deque.isEmpty()) sb.append(-1 + "\n");
				else sb.append(deque.pollLast() + "\n");
			}
			else if (a.equals("size")) {
				sb.append(deque.size() + "\n");
			}
			else if (a.equals("empty")) {
				if (deque.isEmpty()) sb.append(1 + "\n");
				else sb.append(0 + "\n");
			}
			else if (a.equals("front")) {
				if (deque.isEmpty()) sb.append(-1 + "\n");
				else sb.append(deque.peekFirst() + "\n");
			}
			else if (a.equals("back")) {
				if (deque.isEmpty()) sb.append(-1 + "\n");
				else sb.append(deque.peekLast() + "\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
