package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
	static class Print {
		int pri;
		int idx;
		
		public Print(int pri, int idx) {
			this.pri = pri;
			this.idx = idx;
		}
	}
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        Queue<Print> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < priorities.length; i++) {
        	Print print = new Print(priorities[i], i);
        	queue.add(print);
        	arr.add(priorities[i]);
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        while (!queue.isEmpty()) {
        	int a = arr.get(0);
        	
        	if (a > queue.peek().pri) {
        		queue.add(queue.poll());
        	}
        	else if (a == queue.peek().pri) {
        		if (queue.peek().idx == location) {
        			break;
        		}
        		queue.poll();
        		arr.remove(0);
        		answer++;
        	}
        }
        
        return answer;
    }
}
