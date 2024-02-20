package Programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 숫자게임 {
	public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int num : B) {
            queue.add(num);
        }
        
        for (int aNum : A) {
            for (int i = 0; i < queue.size(); i++) {
                int num = queue.poll();
                if (aNum < num) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
