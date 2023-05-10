package Programmers;

public class z124나라의숫자 {
	public String solution(int n) {
        String answer = "";
        
        while (n > 0) {
        	int num = n % 3;
        	
        	if (num == 0) {
        		answer = "4" + answer;
        		n = n / 3 - 1;
        	}
        	else {
        		answer = String.valueOf(num) + answer;
        		n = n / 3;
        	}
        	
        }
        
        return answer;
    }
}
