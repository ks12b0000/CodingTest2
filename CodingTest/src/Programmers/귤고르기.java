package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 귤고르기 {
	public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tangerine.length; i++) {       	
        	if (hashMap.containsKey(tangerine[i])) {
        		hashMap.put(tangerine[i], hashMap.get(tangerine[i]) + 1);
        		continue;
        	}
        	hashMap.put(tangerine[i], 1);
        }
 
        ArrayList<Integer> arrayList = new ArrayList<>(hashMap.values());
        Collections.sort(arrayList, Collections.reverseOrder());
        
        int sum = 0;
        for (int x : arrayList) {
        	answer++;      	
        	sum += x;
        	if (sum >= k) {
        		break;
        	}
        }
        
        return answer;
    }
}
