package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
	public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String operation : operations) {
            String[] str = operation.split(" ");
            if (str[0].equals("I")) {
                int num = Integer.parseInt(str[1]);
                maxQueue.add(num);
                minQueue.add(num);
            } else if (str[0].equals("D")) {
                if (str[1].equals("-1")) {
                    if (!minQueue.isEmpty()) {
                        maxQueue.remove(minQueue.poll());
                    }
                } else {
                    if (!maxQueue.isEmpty()) {
                        minQueue.remove(maxQueue.poll());
                    }
                }
            }
        }
        
        if (minQueue.isEmpty() && maxQueue.isEmpty()) {
            return answer;
        }
        
        answer[0] = maxQueue.peek();
        answer[1] = minQueue.peek();
        
        return answer;
    }
}
