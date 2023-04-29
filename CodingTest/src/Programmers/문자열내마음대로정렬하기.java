package Programmers;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Arrays.sort(strings, (e1, e2) -> {
        	char a = e1.charAt(n);
        	char b = e2.charAt(n);
        	
        	if (a == b) {       		
        		for (int i = 0; i < e1.length(); i++) {
        			if (e1.charAt(i) != e2.charAt(i)) {
        				return e1.charAt(i) - e2.charAt(i);
        			}
        		}
        	}
        	
        	return a - b;
        });
        
        answer = strings;
        
        return answer;
    }
}
