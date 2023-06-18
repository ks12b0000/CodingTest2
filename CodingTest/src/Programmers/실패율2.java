package Programmers;
import java.util.*;

public class 실패율2 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Double> hashMap = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            double cnt = 0;
            double num = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    cnt++;
                }
                if (stages[j] == i) {
                    num++;
                }
            }
            if(cnt == 0 && num == 0) cnt = 1;
            hashMap.put(i, num / cnt);
        }
        
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : hashMap.keySet()){
                if(max < hashMap.get(key)){
                    max = hashMap.get(key);
                    rKey = key;
                }
            }
            answer[i] = rKey;
            hashMap.remove(rKey);
        }
        
        return answer;
    }
}
