package Programmers;

import java.util.Arrays;

public class 가장큰수 {
	public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for (int i = 0; i < str.length; i++) {
        	str[i] = String.valueOf(numbers[i]);
        }
                
        Arrays.sort(str, (e1, e2) -> {
        	return (e2 + e1).compareTo(e1 + e2);      	
        });
        
        if (str[0].equals("0")) return "0";
        
        for (int i = 0; i < str.length; i++) {
        	answer += str[i];
        }        
        
        return answer;
    }
}
