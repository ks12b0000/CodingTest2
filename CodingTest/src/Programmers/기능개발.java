package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        Queue<Integer> arr = new LinkedList<Integer>();
        
        for (int i = 0; i < progresses.length; i++) {
        	if ((100 - progresses[i]) % speeds[i] != 0) {
        		arr.add(((100 - progresses[i]) / speeds[i]) + 1);
        	}
        	else {
        		arr.add((100 - progresses[i]) / speeds[i]);
        	}
        }
        
        
        while (!arr.isEmpty()) {
            int cnt = 1;
        	int a = arr.poll();
        	if (arr.isEmpty()) {
        		answer.add(cnt);
        		break;
        	}
        	if (a < arr.peek()) {
        		answer.add(cnt);
        		continue;
        	}
        	else if (a >= arr.peek()) {
                while (true) {
                    cnt++;
                    arr.poll();
                    if (arr.isEmpty() || a < arr.peek()) {
                        break;
                    }
                } 
                answer.add(cnt);
            }        	
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }

}
