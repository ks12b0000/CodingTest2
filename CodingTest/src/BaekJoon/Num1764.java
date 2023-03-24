package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			String a = sc.nextLine();
			
			if (a.contains("push")) {
				String b = a.substring(5);
				queue.offer(Integer.parseInt(b));
			}
			else if (a.equals("front")) {
				if (queue.isEmpty()) sb.append(-1 + "\n");
				else sb.append(queue.peek() + "\n");
			}
			else if (a.equals("back")) {
				if (queue.isEmpty()) sb.append(-1 + "\n");
				else {
					Integer it = ((LinkedList<Integer>) queue).peekLast();
					sb.append(it + "\n");
				}
			}
			else if (a.equals("size")) {
				sb.append(queue.size() + "\n");
			}
			else if (a.equals("empty")) {
				if (queue.isEmpty()) sb.append(1 + "\n");
				else sb.append(0 + "\n");
			}
			else if (a.equals("pop")) {
				if (queue.isEmpty()) sb.append(-1 + "\n");
				else sb.append(queue.poll() + "\n");
			}
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
