package Programmers;

public class 소수만들기 {
	public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            int num = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    num = nums[i] + nums[j] + nums[k];
                    if (sosu(num)) answer++;
                }
            }
        }

        return answer;
    }
    boolean sosu(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
