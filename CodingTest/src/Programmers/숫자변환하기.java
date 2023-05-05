package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 숫자변환하기 {
	public int solution(int x, int y, int n) {
        int answer = 0;
        
        if (x == y) return 0;
        
        int[] arr = new int[1000001];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(x);
        
        while (!queue.isEmpty()) {
        	int num = queue.poll();
        	int[] tmp = new int[3];
        	
        	tmp[0] = num + n;
        	tmp[1] = num * 2;
        	tmp[2] = num * 3;
        	
        	for (int i = 0; i < 3; i++) {
        		int next = tmp[i];
        		
        		if (next > y) continue;
        		if (arr[next] == 0 || arr[next] > arr[num] + 1) {
        			arr[next] = arr[num] + 1;
        			queue.add(next);
        		}
        	}
        }
        
        if (arr[y] == 0) {
        	answer = -1;
        }
        else {
        	answer = arr[y];
        }
        
        return answer;
    }
}
