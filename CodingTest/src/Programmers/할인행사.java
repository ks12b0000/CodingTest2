package Programmers;

import java.util.ArrayList;

public class 할인행사 {
	public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        ArrayList<String> arr = new ArrayList<String>();
        
        for (int i = 0; i < want.length; i++) {
        	while (number[i]-- > 0) {
        		arr.add(want[i]);
        	}      	
        }
        
        for (int i = 0; i <= discount.length - arr.size(); i++) {
        	ArrayList<String> s = (ArrayList<String>) arr.clone();
        	for (int j = i; j < i + arr.size(); j++) {
        		if (s.contains(discount[j])) {
        			s.remove(discount[j]);
        		}
        		else {
        			break;
        		}
        	}
        	
        	if (s.size() == 0) answer++;
        }
        
        
        return answer;
    }
}
