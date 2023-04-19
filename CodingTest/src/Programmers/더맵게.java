package Programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        Queue<Integer> queue = new PriorityQueue<Integer>();
        
        for (int i = 0; i < scoville.length; i++) {
        	queue.add(scoville[i]);
        }
        
        while (queue.size() > 0) {
        	if (queue.peek() < K) {
        		int a = queue.poll();
                if (queue.size() == 0) {
                    return -1;
                }
        		int b = queue.poll();
        		
        		queue.add(a + (b * 2));
        		answer++;
        	}
        	else {
        		break;
        	}
        	
        }
        
        return answer;
    }
}
