package Programmers;

import java.util.ArrayList;

public class 개인정보수집유효기간 {
	public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int todayYear = Integer.parseInt(today.substring(0, 4));
        int todayMonth = Integer.parseInt(today.substring(5, 7));
        int todayDay = Integer.parseInt(today.substring(8, 10));
        
        for (int i = 0; i < privacies.length; i++) {
            int year = Integer.parseInt(privacies[i].substring(0, 4));
            int month = Integer.parseInt(privacies[i].substring(5, 7));
            int day = Integer.parseInt(privacies[i].substring(8, 10));
            String type = privacies[i].substring(11, 12);
            
            for (String str : terms) {
                if (type.equals(String.valueOf(str.charAt(0)))) {
                    month += Integer.parseInt(str.substring(2, str.length()));
                    if (month > 12) {
                        year += month / 12;
            			month %= 12;
            			if (month == 0) {
                            year--;
                            month = 12;
                        }
                    }
                }
            }
            if (todayYear > year) {
                answer.add(i + 1);
            }
            else if (todayYear == year && todayMonth > month) {
                answer.add(i + 1);
            }
            else if (todayYear == year && todayMonth == month && todayDay >= day) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
