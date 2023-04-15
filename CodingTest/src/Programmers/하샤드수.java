package Programmers;

public class 하샤드수 {
	public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
        	b += Character.getNumericValue(str.charAt(i));
        }
        
        if (x % b != 0) {
        	answer = false;
        }
        
        return answer;
    }
}
