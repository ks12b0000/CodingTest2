package Programmers;

public class 소수만들기 {
	public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                	int num = nums[i] + nums[j] + nums[k];
                	if (num >= 2 && sosu(num) == true) {                   	                           
                		answer++;
                	}
                }
            }
        }
        return answer;
    }
	static boolean sosu(int num) {	
		boolean ch = true;
		if (num == 2) return ch;
		for (int i = 2; i <= Math.sqrt(num); i++) {
    		if(num % i == 0) {
    			ch = false;
    			break;
    		}
    	}
		return ch;
	}
}
