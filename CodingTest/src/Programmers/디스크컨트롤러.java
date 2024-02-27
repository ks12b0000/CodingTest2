package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {
	public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		}); 
        
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
        
        int idx = 0;
        int count = 0;
        int time = 0;
        
        while (true) {
            if (count == jobs.length) {
                break;
            }
            
            while (idx < jobs.length && jobs[idx][0] <= time) {
                queue.add(jobs[idx++]);
            }
            
            if (!queue.isEmpty()) {
                int[] num = queue.poll();
                answer += time - num[0] + num[1];
                time += num[1];
                count++;
            } else {
                time = jobs[idx][0];
            }
        }        
        
        return answer / jobs.length;
    }
}
