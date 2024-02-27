package Programmers;

import java.util.Arrays;

public class 입국심사 {
	public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        
        long left = 1L;
        long rigth = (long)times[times.length - 1] * n;
        
        while (left < rigth) {
            long mid = (rigth + left) / 2;
            long tmp = 0;
            
            for (int time : times) {
                tmp += mid / time;
            }
            
            if (tmp >= n) {
                rigth = mid;
            } else {
                left = mid + 1;
            }
        }
        
        answer = rigth;
        
        return answer;
    }
}
