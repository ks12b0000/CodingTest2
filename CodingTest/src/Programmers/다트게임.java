package Programmers;

public class 다트게임 {
	public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];
        int n = 0, idx = 0;
        String numStr = "";
        
        for (int i = 0; i < dartResult.length(); i++) {
        	char ch = dartResult.charAt(i);
        	
        	if (ch >= '0' && ch <= '9') {
        		numStr += ch;
        	}
        	else if (ch == 'S' || ch == 'D' || ch == 'T') {
        		n = Integer.parseInt(numStr);
        		if (ch == 'S') {
        			dart[idx++] = (int) Math.pow(n, 1);
        		}
        		else if (ch == 'D') {
        			dart[idx++] = (int) Math.pow(n, 2);
        		}
        		else {
        			dart[idx++] = (int) Math.pow(n, 3);
        		}
        		numStr = "";
        	}
        	else {
        		if (ch == '*') {
        			dart[idx - 1] *= 2;
        			if (idx - 2 >= 0) {
        				dart[idx - 2] *= 2;
        			}
        		}
        		else {
        			dart[idx - 1] *= -1;
        		}
        	}
        }
        
        answer = dart[0] + dart[1] + dart[2];
        
        return answer;
    }
}
//S = 1제곱
//D = 2제곱
//T = 3제곱
//* = 해당 점수 * 2 전 점수 * 2 첫번째 나올경우 해당 점수만 * 2 중첩 가능
//# = - 해당점수
//* , # 중첩 가능 중첩되면 -2배 