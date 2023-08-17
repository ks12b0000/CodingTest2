package Programmers;

import java.util.HashSet;

public class 폰켓몬 {
	public int solution(int[] nums) {
        int answer = 0;       
        HashSet<Integer> set = new HashSet<>();
        
        for (int x : nums) set.add(x);
        
        int len = nums.length / 2;
        
        answer = set.size() > len ? len : set.size();
        
        return answer;
    }
}
