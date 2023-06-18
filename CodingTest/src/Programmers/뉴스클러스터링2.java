package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 뉴스클러스터링2 {
	public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        HashSet<String> hashSet1 = new HashSet<String>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
        	String str = str1.substring(i, i + 2);
        	if (Character.isAlphabetic(str.charAt(0)) && Character.isAlphabetic(str.charAt(1))) {
        		hashMap1.put(str, hashMap1.getOrDefault(str, 0) + 1);
        		hashSet1.add(str);
        	}
        }
        for (int i = 0; i < str2.length() - 1; i++) {
        	String str = str2.substring(i, i + 2);
        	if (Character.isAlphabetic(str.charAt(0)) && Character.isAlphabetic(str.charAt(1))) {
        		hashMap2.put(str, hashMap2.getOrDefault(str, 0) + 1);
        		hashSet1.add(str);
        	}
        }
        
        for(String s : hashMap1.keySet()) {
            if(hashMap2.containsKey(s)) {
                answer += Math.min(hashMap1.get(s), hashMap2.get(s));
            }
        }
        
        int cnt = 0;
        for (String s : hashSet1) {
        	cnt += Math.max(hashMap1.getOrDefault(s, 0), hashMap2.getOrDefault(s, 0));
        }
        
        if (cnt == 0) return 65536;
        
        return answer * 65536 / cnt;
    }
}
