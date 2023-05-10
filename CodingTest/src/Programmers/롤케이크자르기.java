package Programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 롤케이크자르기 {
	public int solution(int[] topping) {
        int answer = 0;
        
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < topping.length; i++) {
        	hashMap.put(topping[i], hashMap.getOrDefault(topping[i], 0) + 1);  
        }
        
        for (int i = 0; i < topping.length; i++) {
        	hashSet.add(topping[i]);
        	hashMap.put(topping[i], hashMap.getOrDefault(topping[i], 0) - 1);
        	
        	if (hashMap.get(topping[i]) == 0) {
        		hashMap.remove(topping[i]);
        	}
        	if (hashSet.size() == hashMap.size()) {
        		answer++;
        	}
        }
        
        
        return answer;
    }
}
