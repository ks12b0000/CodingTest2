package Programmers;

import java.math.BigInteger;

public class 두수의합 {
	public String solution(String a, String b) {
        String answer = "";
        
        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);
        
        answer = c.add(d).toString();
        
        return answer;
    }
}
