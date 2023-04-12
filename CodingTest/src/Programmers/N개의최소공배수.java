package Programmers;

public class N개의최소공배수 {
	public int solution(int[] arr) {
        int answer = 0;
        int idx = 1;
        while (true) {
        	int sum = arr[arr.length - 1] * idx;
        	int cnt = 0;
        	for (int i = 0; i < arr.length - 1; i++) {
        		if (sum % arr[i] == 0) {
        			cnt++;
        		}
        	}
        	if (cnt == arr.length - 1) {
        		answer = sum;
        		break;
        	}    	
        	idx++;
        }
        
        return answer;
    }
}
