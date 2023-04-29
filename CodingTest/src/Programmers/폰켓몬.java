package Programmers;

import java.util.ArrayList;

public class 폰켓몬 {
	public int solution(int[] nums) {
        int answer = 0;
        
        int len = nums.length / 2;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (!arr.contains(nums[i])) {
        		arr.add(nums[i]);
        		if (arr.size() == len) break;
        	}
        }
        
        answer = arr.size();
        
        return answer;
    }
}
