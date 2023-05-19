package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {
	public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0, sum2 = 0;
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        for (int i = 0; i < queue1.length; i++) {
        	sum1 += queue1[i];
        	q1.add(queue1[i]);
        	sum2 += queue2[i];
        	q2.add(queue2[i]);
        }
        
        long total = (sum1 + sum2) / 2;
        int max = q1.size() * 4;
        
        while (sum1 != total && sum2 != total) {
        	answer++;
        	
        	if (sum1 > sum2) {
        		int p = q1.poll();
        		sum1 -= p;
        		sum2 += p;
        		q2.add(p);
        	}
        	else {
        		int p = q2.poll();
        		sum1 += p;
        		sum2 -= p;
        		q1.add(p);
        	}
        	if (answer > max) return -1;
        }       
        
        return answer;
    }
	
}
