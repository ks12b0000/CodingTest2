package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
	public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1] - o2[1];
			}
		});
        
        int max = routes[0][1];
        
        for (int[] arr : routes) {
            if (max < arr[0]) {
                max = arr[1];
                answer++;
            }
        }
        
        return answer;
    }
}
