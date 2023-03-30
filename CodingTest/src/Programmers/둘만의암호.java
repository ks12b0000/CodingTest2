package Programmers;

public class 둘만의암호 {
	public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
        	char x = s.charAt(i);
        	int cnt = 1;
        	
        	while(cnt <= index) {
        		x++;
        		if (x > 'z') {
        			x = 'a';
        		}
        		if (skip.contains(x + "")) {
        			continue;
        		}
        		else {
        			cnt++;
        		}
        	}
        	answer += x;
        }
                
        return answer;
    }
}
