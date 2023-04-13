package Programmers;

public class n2배열자르기 {
	public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right - (int)left + 1];
        // 3 5 5
        for (int i = 0; i < answer.length; i++) {
            int y = (int)(left / n + 1); // 1 2  2 2
            int x = (int)(left % n + 1); // 3 1 2 3
            left++;
            answer[i] = Math.max(y, x);
        }       
        
        return answer;
    }
}
