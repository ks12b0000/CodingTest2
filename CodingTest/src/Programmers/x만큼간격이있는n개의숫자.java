package Programmers;

public class x만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
        	answer[i] = num + x;
        	num = num + x;
        }
        
        return answer;
    }
}
