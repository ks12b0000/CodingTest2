package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class 주차요금계산 {
	public int[] solution(int[] fees, String[] records) {
        ArrayList<Integer> answer = new ArrayList<Integer>();      
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < records.length; i++) {      	
        	String a = records[i].substring(11);
        	int HH = Integer.parseInt(records[i].substring(0, 2)) * 60;
    		int MM = Integer.parseInt(records[i].substring(3, 5));
    		int carNumber = Integer.parseInt(records[i].substring(6, 10));
        	
        	if (a.equals("IN")) {
        		hashMap.put(carNumber, hashMap.getOrDefault(carNumber, 0) + (HH + MM));        		
        	}
        	else {       		
        		hashMap2.put(carNumber, hashMap2.getOrDefault(carNumber, 0) + (Math.abs((HH + MM) - hashMap.get(carNumber))));
        		hashMap.remove(carNumber);
        	}
        }
        
        if (!hashMap.isEmpty()) {
            for (int x : hashMap.keySet()) {
                hashMap2.put(x, hashMap2.getOrDefault(x, 0) + (Math.abs(hashMap.get(x) - 1439)));
            }
        }
        
        
        ArrayList<Integer> keyList = new ArrayList<>(hashMap2.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        
        int basicHH = fees[1];
        int basicFee = fees[0];
        int unitMM = fees[2];
        int unitFee = fees[3];
        
        for (int y : keyList) {
        	if (hashMap2.get(y) <= basicFee) {
        		answer.add(basicHH);
        	}
        	else {
        		if ((hashMap2.get(y) - basicFee) % unitMM != 0) {
        			answer.add((basicHH + ((hashMap2.get(y) - basicFee) / unitMM) * unitFee) + unitFee);
        		}
        		else {
        			answer.add(basicHH + ((hashMap2.get(y) - basicFee) / unitMM) * unitFee);
        		}
        		
        	}
        }
                
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
