package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
	public int solution(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
        	queue.add(priorities[i]);
        }
        
        while (!queue.isEmpty()) {
        	for (int i = 0; i < priorities.length; i++) {
        		if (queue.peek() == priorities[i]) { 
        			if (i == location) {
        				return answer;
        			}
        			queue.poll();
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
}
