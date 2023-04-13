package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        String str = "";
        for (int i = 0; i < arr.length; i++) {
        	str += arr[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}
