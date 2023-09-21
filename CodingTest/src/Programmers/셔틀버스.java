package Programmers;

import java.util.PriorityQueue;

public class 셔틀버스 {
	public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
              
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int startTime = 9 * 60;
        
        for (String str : timetable) {
            String[] arr = str.split(":");
            int time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
            queue.add(time);
        }
        
        int lastTime = 0;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
        	cnt = 0;    	
        	while (!queue.isEmpty()) {
        		int time = queue.peek();
        		if (time <= startTime && cnt < m) {
            		queue.poll();
            		cnt++;
                    lastTime = time - 1;
            	}
            	else break;       		
        	}
        	startTime += t;
        }
        
        if (cnt < m) {
        	lastTime = startTime - t;
        }
        
        String hh = String.format("%02d", lastTime / 60);
        String mm = String.format("%02d", lastTime % 60);
        
        answer = hh + ":" + mm;
        
        return answer;
    }
}
