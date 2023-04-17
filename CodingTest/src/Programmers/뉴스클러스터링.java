package Programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 뉴스클러스터링 {
	public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        HashMap<String, Integer> map1 = new HashMap<>(); 
        HashMap<String, Integer> map2 = new HashMap<>(); 
        HashSet<String> set = new HashSet<>(); 
        
        for(int i = 0; i < str1.length() - 1 ; i ++){
            String temp = str1.substring(i, i + 2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map1.put(temp, map1.getOrDefault(temp, 0) + 1);
                set.add(temp);
            }
        }

        for(int i = 0; i < str2.length() - 1 ; i ++){
            String temp = str2.substring(i, i + 2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map2.put(temp, map2.getOrDefault(temp, 0) + 1);
                set.add(temp);
            }
        }

        int total = 0;
        for(String s : set) {
            total += Math.max(map1.getOrDefault(s, 0) , map2.getOrDefault(s, 0));
        }
        for(String s : map2.keySet()) {
            if(map1.containsKey(s)) {
                answer += Math.min(map1.get(s), map2.get(s));
            }
        }

        if(total == 0) return 65536;
        return answer * 65536 / total;
    }
}
