package Programmers;

public class e2016년 {
	public String solution(int a, int b) {
        String answer = "";
        String[] weeks = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDay = 0;
        
        for (int i = 0; i < a - 1; i++) {
        	totalDay += day[i];
        }
        totalDay += b - 1;
        totalDay %= 7;
        
        answer = weeks[totalDay];
        
        return answer;
    }
}
