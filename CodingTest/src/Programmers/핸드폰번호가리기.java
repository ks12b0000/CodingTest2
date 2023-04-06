package Programmers;

public class 핸드폰번호가리기 {
	public String solution(String phone_number) {
        String answer = "";
        int n = phone_number.length() - 4;
        
        for (int i = 0; i < n; i++) {
        	answer += "*";
        }
        
        answer += phone_number.substring(n);
        
        return answer;
    }
}
