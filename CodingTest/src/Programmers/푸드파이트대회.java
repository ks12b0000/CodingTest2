package Programmers;

public class 푸드파이트대회 {
	public String solution(int[] food) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        for (int i = 1; i < food.length; i++) {
            int len = food[i] / 2;
            for (int j = 0; j < len; j++) {
                answer += i;
                sb.append(i);
            }
        }
               
        answer += "0" + sb.reverse();
        
        return answer;
    }
}
