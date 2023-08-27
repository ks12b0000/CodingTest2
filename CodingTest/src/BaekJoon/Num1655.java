package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Num1655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (maxQueue.size() == minQueue.size()) {
				maxQueue.add(num);
			}
			else {
				minQueue.add(num);
			}
			
			if (!maxQueue.isEmpty() && !minQueue.isEmpty() && maxQueue.peek() > minQueue.peek()) {
				int tmp = minQueue.poll();
				minQueue.add(maxQueue.poll());
				maxQueue.add(tmp);
			}
			sb.append(maxQueue.peek() + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
