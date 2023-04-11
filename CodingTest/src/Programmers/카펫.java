package Programmers;


public class 카펫 {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 1; i <= yellow; i++) { 
        	if (yellow % i == 0) { 
        		int a = i + 2;
        		int b = (yellow / i) + 2;
        		
        		if (a * b == sum) {
        			answer[0] = Math.max(a, b);
        			answer[1] = Math.min(a, b);
        		}
        	}
        }
        
        return answer;
    }
}
