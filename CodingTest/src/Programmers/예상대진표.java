package Programmers;

public class 예상대진표 {
	public int solution(int n, int a, int b) {
        int answer = 0;
        a = a - 1;
        b = b - 1;
        
        while(a != b) {  
        	a = a / 2;  
        	b = b / 2;  
        	        	
        	answer++;
        }

        return answer;
    }
}
