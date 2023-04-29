package Programmers;

public class 소수찾기 {
	static int answer = 0;
	public int solution(int n) {
        
        for (int i = 2; i <= n; i++) {
        	sosu(i);
        }
        
        return answer;
    }
	static void sosu(int number) {		 		
		if(number == 2) {
			answer++;
			return;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i++) {        
			if(number % i == 0) {
				return;
			}
		}
		answer++;
	}
}
