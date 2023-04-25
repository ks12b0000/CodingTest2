package Programmers;

import java.util.HashMap;

public class 달리기경주 {
	public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
                
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
            answer[i] = players[i];
        }
        
        for (int i = 0; i < callings.length; i++) {
        	int idx = hashMap.get(callings[i]);
        	String tmp = answer[idx - 1];
        	
            answer[idx - 1] = answer[idx];
            answer[idx] = tmp;
            
            hashMap.put(answer[idx - 1], idx - 1);
            hashMap.put(answer[idx], idx);
        }
        
        return answer;
    }
}
