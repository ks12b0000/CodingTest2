package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시2 {
	public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        
        if (cacheSize == 0) {
        	return 5 * cities.length;
        }
        for (int i = 0; i < cities.length; i++) {
            String str = cities[i].toLowerCase();
            if (queue.contains(str)) {
                queue.remove(str);
                queue.add(str);
                answer += 1;
            }
            else {
                if (queue.size() < cacheSize) {
                    queue.add(str);
                }
                else {
                    queue.poll();
                    queue.add(str);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}
