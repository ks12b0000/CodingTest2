package Programmers;

public class 최소직사각형 {
	public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = Integer.MIN_VALUE;
        int max_h = Integer.MIN_VALUE;
        
        for (int i = 0; i < sizes.length; i++) {
        	int h = Math.min(sizes[i][0], sizes[i][1]);
        	int w = Math.max(sizes[i][0], sizes[i][1]);
        	
        	max_w = Math.max(max_w, w);
        	max_h = Math.max(max_h, h);
        }
        
        answer = max_w * max_h;
        
        return answer;
    }
}
