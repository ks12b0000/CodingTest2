package Programmers;

public class 최고의집합 {
	public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if (n > s) {
            return new int[] {-1};
        }
        
        int idx = 0;
        
        while (n > 0){
            int value = s / n;
            answer[idx++] = value;
            s -= value;
            n--;
        }
        
        
        return answer;
    }
}
