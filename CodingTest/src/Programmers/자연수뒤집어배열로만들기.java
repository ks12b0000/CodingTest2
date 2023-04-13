package Programmers;

public class 자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		String str = sb.reverse().toString();
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = Character.getNumericValue(str.charAt(i));
        }
        
        return answer;
    }
}
