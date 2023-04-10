package Programmers;

public class 숫자의표현 {
	public int solution(int n) {
        int answer = 0;       
        int idx = 1;
        
        while (idx <= n) {
        	int sum = 0;
        	for (int i = idx; i <= n; i++) {
        		sum += i;
        		if (sum > n) {
        			idx++;
        			break;
        		}
        		else if (sum == n) {
        			idx++;
        			answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
