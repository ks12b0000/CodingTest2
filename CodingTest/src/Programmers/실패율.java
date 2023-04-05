package Programmers;

import java.util.HashMap;

public class 실패율 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
        for (int i = 1; i <= N; i++) {
        	double sum = 0;
        	double m = 0;
        	for (int j = 0; j < stages.length; j++) {
        		if (i <= stages[j]) {
            		m++;
            	}
        		if (i == stages[j]) {
        			sum++;
        		}
        	}  
        	if(sum == 0 && m == 0) m = 1;
        	hashMap.put(i, sum / m);
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
