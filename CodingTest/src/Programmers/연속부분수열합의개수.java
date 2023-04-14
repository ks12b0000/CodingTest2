package Programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class 연속부분수열합의개수 {
	public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < elements.length; j++) {
            	list.add(elements[j]);
            }
        }
        
        int len = elements.length;
        int idx = 1;
        
        while (len-- > 0) { 
        	for (int i = 0; i < elements.length; i++) { 
                int sum = 0;
        		for (int j = i + 1; j <= i + idx; j++) {
        			sum += list.get(j);
        		}    
        		hashSet.add(sum);
        	}
        	idx++;
        }
        
        answer = hashSet.size();
        
        return answer;
    }
}
