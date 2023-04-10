package Programmers;

public class 이진변환반복하기 {
	public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int remove = 0;
        
        while (s.length() > 1) {
        	cnt++;
        	for (int i = 0; i < s.length(); i++) {
        		if (s.charAt(i) == '0') {
        			remove++;
        		}
        	}
        	if (s.contains("0")) {
        		s = s.replaceAll("0", "");
        	}
        	s = Integer.toBinaryString(s.length());
        }
        
        answer[0] = cnt;
        answer[1] = remove;
        
        return answer;
    }
}
