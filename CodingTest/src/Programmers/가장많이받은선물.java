package Programmers;

import java.util.HashMap;

public class 가장많이받은선물 {
	public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // 누가 누구한테 선물 보낸 횟수 저장
        HashMap<String, Integer> giftSend = new HashMap<>();
        // 누가 누구한테 선물 받은 횟수 저장
        HashMap<String, Integer> giftReceive = new HashMap<>();  
        // 선물 지수 저장
        HashMap<String, Integer> giftHistory = new HashMap<>();
        // 다음 달 선물 받을 사람, 횟수 저장
        HashMap<String, Integer> nextMonthGift = new HashMap<>();
        
        // 선물 지수 0으로 초기화
        for (String friend : friends) {
            giftHistory.put(friend, 0);   
        }
        
        for (String gift : gifts) {
            String[] tmp = gift.split(" ");
            String s = tmp[1] + " " + tmp[0];
            
            // ex) gift = muzi frodo 일 때
            // muzi가 frodo한테 선물 보낸 횟수 증가 
            giftSend.put(gift, giftSend.getOrDefault(gift, 0) + 1);
            
            // muzi가 frodo한테 선물 받은 횟수 증가 
            giftReceive.put(s, giftReceive.getOrDefault(s, 0) + 1);
            
            // muzi의 선물 지수 +1
            giftHistory.put(tmp[0], giftHistory.get(tmp[0]) + 1);
            
            // frodo의 선물 지수 -1
            giftHistory.put(tmp[1], giftHistory.get(tmp[1]) - 1);
        }
        
        // 모든 친구랑 비교해보면서
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String str = friends[i] + " " + friends[j];
                String s = friends[j] + " " + friends[i];
                
                // friends[i] -> friends[j] 한테 선물을 보낸 횟수
                int a = giftSend.getOrDefault(str, 0);
                // friends[j] -> friends[i] 한테 선물을 보낸 횟수
                int b = giftSend.getOrDefault(s, 0);
                
                // 두 친구중 선물을 보낸 횟수가 더 많은 친구의 다음 달 선물 받을 횟수 +1(friends[i]가 더 많을 경우)
                if (a > b) {
                	nextMonthGift.put(friends[i], nextMonthGift.getOrDefault(friends[i], 0) + 1);
                } else if (a == b) { // 두 친구의 선물을 보낸 횟수가 같다면 두 친구의 선물 지수를 비교해서 더 큰 친구의 다음 달 선물 받을 횟수 +1
                    if (giftHistory.get(friends[i]) > giftHistory.get(friends[j])) {
                    	nextMonthGift.put(friends[i], nextMonthGift.getOrDefault(friends[i], 0) + 1);         
                    } else if (giftHistory.get(friends[i]) < giftHistory.get(friends[j])) {
                    	nextMonthGift.put(friends[j], nextMonthGift.getOrDefault(friends[j], 0) + 1);
                    }
                } else { // 두 친구중 선물을 보낸 횟수가 더 많은 친구의 다음 달 선물 받을 횟수 +1(friends[j]가 더 많을 경우)
                	nextMonthGift.put(friends[j], nextMonthGift.getOrDefault(friends[j], 0) + 1);
                }
            }         
        }
        
        // 다음 달에 가장 많은 선물을 받는 친구가 받을 선물의 수 구하기
        for (String str : nextMonthGift.keySet()) {
            answer = Math.max(answer, nextMonthGift.get(str));
        }
        
        return answer;
    }
}
