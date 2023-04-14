package Programmers;

import java.util.HashMap;

public class 위장 {
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
        	if (hashMap.containsKey(clothes[i][1])) {
        		hashMap.put(clothes[i][1], hashMap.get(clothes[i][1]) + 1);
        		continue;
        	}
        	hashMap.put(clothes[i][1], 1);      	
        }
        
        for (String x : hashMap.keySet()) {
        	answer *= (hashMap.get(x) + 1);
        }
        
        return answer - 1;
    }
}
