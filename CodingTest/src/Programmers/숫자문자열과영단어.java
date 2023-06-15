package Programmers;

public class 숫자문자열과영단어 {
	public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
        	s = s.replace(arr[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
