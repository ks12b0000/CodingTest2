package Programmers;

import java.util.HashMap;

public class 의상 {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        if (map.size() == 1) {
            answer = clothes.length;
            return answer;
        }
       
        for (String s : map.keySet()) {
            // 착용안하는 경우의 수 = + 1
            answer *= (map.get(s) + 1);
        }
        
        return answer - 1;
    }
}
