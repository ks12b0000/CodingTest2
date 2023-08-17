package Programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
        }
        
        for (String str : report) {
            String[] arr = str.split(" ");
            map.get(arr[1]).add(arr[0]);
        }
        
        for (String str : map.keySet()) {
            if (map.get(str).size() >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (map.get(str).contains(id_list[i])) {
                    	answer[i] += 1;
                    }
                }
            }
        }
                
        return answer;
    }
}
