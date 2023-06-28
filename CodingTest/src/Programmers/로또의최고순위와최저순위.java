package Programmers;

import java.util.HashSet;

public class 로또의최고순위와최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] lotto = new int[]{6, 5, 4, 3, 2, 1};
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < win_nums.length; i++) {
            set.add(win_nums[i]);
        }
        
        int win = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (set.contains(lottos[i])) {
                win++;
                set.remove(lottos[i]);
            }
            if (lottos[i] == 0) {
                zero++;
            }
        }
        if (zero == 6) {
            answer[0] = 1;
            answer[1] = 6;
            return answer;
        }
        
        if (win == 6) {
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }
        
        for (int i = 0; i < lotto.length; i++) {
            if (i == 5) {
                answer[1] = 6;
            }
            if (win == lotto[i]) {
                answer[1] = i + 1;
                break;
            }
        }
        
        answer[0] = answer[1] - zero;
        
        return answer;
    }
}
