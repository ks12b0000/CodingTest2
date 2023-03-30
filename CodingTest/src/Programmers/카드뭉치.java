package Programmers;


public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        for (int i = 0; i < goal.length; i++) {
        	for (int j = 0; j < cards1.length; j++) {
        		if (goal[i].equals(cards1[j])) {
        			if (j == 0) {
        				cards1[j] = " "; 
        				continue;
        			}
    				if (!cards1[j - 1].equals(" ")) {
    					return "No";
    				}
    				cards1[j] = " "; 
    			}
        		for (int k = 0; k <cards2.length; k++) {
        			if (goal[i].equals(cards2[k])) {
        				if (k == 0) {
            				cards2[k] = " "; 
            				continue;
            			}
        				if (!cards2[k - 1].equals(" ")) {
        					return "No";
        				}
        				cards2[k] = " ";
        			}
        		}
        	}
        }
          
        return answer;
    }
}
