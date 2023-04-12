package Programmers;

public class 멀리뛰기 {
	public long solution(int n) {
        long answer = 0;
        long[] arr = new long[n + 1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        
        for (int i = 3; i <= n; i++) {
        	arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }
        
        answer = arr[n];
        
        return answer;
    }

}
