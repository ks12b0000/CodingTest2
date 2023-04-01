package Programmers;


public class 키패드누르기 {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10;
        int r = 12;
        
        for (int i = 0; i < numbers.length; i++) {
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		l = numbers[i];
        	}
        	else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		r = numbers[i];
        	}
        	else {
        		if(numbers[i] == 0) numbers[i] = 11;
                int leftdist = Math.abs(numbers[i] - l) / 3 + Math.abs(numbers[i] - l) % 3;
                int rightdist = Math.abs(numbers[i] - r) / 3 + Math.abs(numbers[i] - r) % 3;

        		if (leftdist > rightdist) {
        			answer += "R";
        			r = numbers[i];
        		}
        		else if (leftdist < rightdist) {
        			answer += "L";
        			l = numbers[i];
        		}
        		else {
        			if (hand.equals("right")) {
        				answer += "R";
        				r = numbers[i];
        			}
        			else {
        				answer += "L";
        				l = numbers[i];
        			}
        		}
        	}
        }
 
        return answer;
    }
}
