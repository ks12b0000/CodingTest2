package Programmers;

import java.util.HashMap;

public class 가장많이받은선물 {
	public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        HashMap<String, Integer> giftSend = new HashMap<>();
        HashMap<String, Integer> giftReceive = new HashMap<>();  
        HashMap<String, Integer> giftHistory = new HashMap<>();
        HashMap<String, Integer> nextMonthGift = new HashMap<>();
        
        for (String friend : friends) {
            giftHistory.put(friend, 0);   
        }
        
        for (String gift : gifts) {
            String[] tmp = gift.split(" ");
            String s = tmp[1] + " " + tmp[0];
            
            giftSend.put(gift, giftSend.getOrDefault(gift, 0) + 1);
            giftReceive.put(s, giftReceive.getOrDefault(s, 0) + 1);
            giftHistory.put(tmp[0], giftHistory.get(tmp[0]) + 1);
            giftHistory.put(tmp[1], giftHistory.get(tmp[1]) - 1);
        }
        
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String str = friends[i] + " " + friends[j];
                String s = friends[j] + " " + friends[i];
                int a = giftSend.getOrDefault(str, 0);
                int b = giftSend.getOrDefault(s, 0);
                
                if (a > b) {
                	nextMonthGift.put(friends[i], nextMonthGift.getOrDefault(friends[i], 0) + 1);
                } else if (a == b) {
                    if (giftHistory.get(friends[i]) > giftHistory.get(friends[j])) {
                    	nextMonthGift.put(friends[i], nextMonthGift.getOrDefault(friends[i], 0) + 1);         
                    } else if (giftHistory.get(friends[i]) < giftHistory.get(friends[j])) {
                    	nextMonthGift.put(friends[j], nextMonthGift.getOrDefault(friends[j], 0) + 1);
                    }
                } else {
                	nextMonthGift.put(friends[j], nextMonthGift.getOrDefault(friends[j], 0) + 1);
                }
            }         
        }
        
        for (String str : nextMonthGift.keySet()) {
            answer = Math.max(answer, nextMonthGift.get(str));
        }
        
        return answer;
    }
}
