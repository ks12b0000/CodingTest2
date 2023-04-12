package Programmers;

import java.util.Arrays;

public class HIndex {
	public int solution(int[] citations) {
		int answer = 0;
        Arrays.sort(citations);
        // 5 6 7
        for(int i = 0; i < citations.length; i++) {
            int smaller = Math.min(citations[i], citations.length - i); 
            answer = Math.max(answer, smaller); // 3 
        }
        return answer;
    }
        
       
}
