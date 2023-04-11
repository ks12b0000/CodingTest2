package Programmers;

import java.util.Arrays;

public class 구명보트 {
	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int sum = 0;
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) { 
        	sum += people[left] + people[right]; 
        	if (left == right) {
        		answer++;
        		break;
        	}
        	else if (sum > limit) { 
    			answer++;
    			right--;
    			sum = 0;
    		}
    		else {
    			answer++;
    			left++;
    			right--;
    			sum = 0;
    		}
        }
        return answer;
    }
}