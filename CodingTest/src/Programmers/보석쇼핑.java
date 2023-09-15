package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class 보석쇼핑 {
	public int[] solution(String[] gems) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        
        for (String str : gems) {
            set.add(str);
        }

        int idx = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < gems.length; i++) {
            if (!map.containsKey(gems[i])) {
            	map.put(gems[i], 1);
            }
            else {
            	map.put(gems[i], map.get(gems[i]) + 1);
            }
        	queue.add(gems[i]);
        	
        	while (true) {
        		String tmp = queue.peek();
        		if (map.get(tmp) > 1) {
        			map.put(tmp, map.get(tmp) - 1);
        			queue.poll();
        			idx++;
        		}
        		else break;
        	}
        	if (map.size() == set.size() && min > queue.size()) {
        		min = queue.size();
        		answer[0] = idx + 1;
        		answer[1] = min + idx;
        	}
            
        }
        
        return answer;
    }
}
