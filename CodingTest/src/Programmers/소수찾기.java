package Programmers;

public class 소수찾기 {
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {
            if (sosu(i)) answer++;
        }    
        
        return answer;
    }
    static boolean sosu(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
