package Programmers;

public class 문자열을정수로바꾸기 {
	public int solution(String s) {
        int answer = 0;
        
        if (s.charAt(0) == '-') {
            answer = Integer.parseInt(s.substring(0));
        }
        else if (s.charAt(0) == '+'){
        	answer = Integer.parseInt(s.substring(0));
        }
        else {
        	answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}
