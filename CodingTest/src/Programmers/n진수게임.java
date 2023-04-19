package Programmers;

public class n진수게임 {
	public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        int idx = 0;
        while (m * t > str.length()) {
        	String a = Integer.toString(idx, n);
        	str += a;
            idx++;
        }
        
        idx = p - 1;
        while (answer.length() < t) {
        	answer += str.charAt(idx);
        	idx += m;
        }
        
        
        return answer.toUpperCase();
    }
}
