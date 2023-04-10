package Programmers;

public class 다음큰숫자 {
	public int solution(int n) {
        int answer = 0;
        String len = Integer.toBinaryString(n);
        int nlen = 0;
        
        for (int i = 0; i < len.length(); i++) {
        	if (len.charAt(i) == '1') nlen++;
        }
        
        while (true) {
        	n++;
        	int m = 0;
        	String length = Integer.toBinaryString(n);
            for (int i = 0; i < length.length(); i++) {
            	if (length.charAt(i) == '1') m++;
            }
            if (m == nlen) {
            	answer = n;
            	break;
            }
        }
        
        return answer;
    }
}
