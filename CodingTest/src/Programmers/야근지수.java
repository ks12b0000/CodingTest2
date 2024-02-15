package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class 야근지수 {
	public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        int sum = 0;
        
        for (int num : works) {
            queue.add(num);
            sum += num;
        }
        
        if (sum <= n) {
            answer = 0;
            return answer;
        }
        
        while (n-- > 0) {
            int num = queue.poll();
            num--;
            queue.add(num);
        }
        
        for (int num : queue) {
            answer += num * num;
        }
        
        return answer;
    }
}
