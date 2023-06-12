package Programmers;

import java.util.ArrayList;

public class 개인정보수집유효기간 {
	public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int todayYY = Integer.parseInt(today.substring(0, 4));
        int todayMM = Integer.parseInt(today.substring(5, 7));
        int todayDD = Integer.parseInt(today.substring(8, 10));
        
        for (int i = 0; i < privacies.length; i++) {
        	int yy = Integer.parseInt(privacies[i].substring(0, 4));
            int mm = Integer.parseInt(privacies[i].substring(5, 7));
            int dd = Integer.parseInt(privacies[i].substring(8, 10));
            
            String tm = privacies[i].substring(11);
            
            for (int j = 0; j < terms.length; j++) {
            	if (tm.equals(terms[j].charAt(0) + "")) {
            		mm += Integer.parseInt(terms[j].substring(2));
            		if (mm > 12) {
            			yy += mm / 12;
            			mm = mm % 12;
            			if (mm == 0) {
            				yy -= 1;
            				mm = 12;
            			}
            		}
            	}
            }
            if (todayYY > yy) {
            	answer.add(i + 1);
            }
            else if (todayYY == yy && todayMM > mm) {
            	answer.add(i + 1);
            }
            else if (todayYY == yy && todayMM == mm && todayDD >= dd) {
            	answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
