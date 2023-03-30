package Programmers;

import java.util.HashMap;

public class 대충만든자판 {
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < keymap.length; i++) {
        	for (int j = 0; j < keymap[i].length(); j++) {
        		if (hashMap.get(keymap[i].charAt(j)) == null) {
        			hashMap.put(keymap[i].charAt(j), j + 1);
        		}
        		else {
        			hashMap.put(keymap[i].charAt(j), Math.min(hashMap.get(keymap[i].charAt(j)), j + 1));
        		}      		
        	}
        }
                
        for (int i = 0; i < targets.length; i++) {
        	for (int j = 0; j < targets[i].length(); j++) {
        		if (hashMap.get(targets[i].charAt(j)) == null) {
        			 answer[i] = -1;
        			 System.out.println(answer[i]);
        			 break;
        		}
        		answer[i] += hashMap.get(targets[i].charAt(j));
        	}
        }
        
        return answer;
    }
}
