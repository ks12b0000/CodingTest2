package Programmers;

import java.util.ArrayList;

public class 영어끝말잇기 {
	public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int idx = 1;
        int len = words.length - 1;
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(words[0]);
        while (len-- > 0) {      	
        	if (arr.get(idx - 1).charAt(arr.get(idx - 1).length() - 1) != words[idx].charAt(0) || arr.contains(words[idx])) {        		
                answer[0] = (idx % n) + 1;
                answer[1] = (idx / n) + 1;
        		break;
        	}
        	arr.add(words[idx]);  
        	idx++;
        }
                
        return answer;
    }
}
