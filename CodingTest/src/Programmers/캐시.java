package Programmers;

import java.util.LinkedList;

public class 캐시 {
	public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String> list = new LinkedList<String>();
        
        if (cacheSize == 0) {
        	return 5 * cities.length;
        }
        for (String x : cities) {
        	String str = x.toLowerCase();
        	if (list.contains(str)) {
        		list.remove(str);
        		list.offer(str);
        		answer += 1;
        	}
        	else {
        		if (cacheSize > list.size()) {       			
            		list.offer(str);
        		}  
        		else {
        			list.poll();
            		list.offer(str);
        		}       		
        		answer += 5;
        	}
        }
        
        return answer;
    }
}
