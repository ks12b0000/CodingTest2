package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class 압축 {
	public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        for (int i = 1; i <= 26; i++) {
        	char ch = (char) (64 + i);
        	hashMap.put(ch + "" , i);
        }
               
        for (int i = 0; i < msg.length(); i++) {
        	String w = String.valueOf(msg.charAt(i));
        	if (i == msg.length() - 1) {
        		answer.add(hashMap.get(w));
        		break;
        	}
        	String c = String.valueOf(msg.charAt(i + 1));
        	
        	while (hashMap.containsKey(w + c)) {
        		w += c;
        		i++;
        		
        		if (i == msg.length() - 1) {
        			c = "";
        			break;
        		}
        		c = String.valueOf(msg.charAt(i + 1));
        	}
        	
        	if (!hashMap.containsKey(w + c)) {
        		hashMap.put(w + c, hashMap.size() + 1);
        	}
        	
    		answer.add(hashMap.get(w));
        	        	
        	if (i == msg.length() - 1 && !c.equals("")) {
        		answer.add(hashMap.get(c));
        	}
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
