package Programmers;


public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int oneIdx = 0;
        int twoIdx = 0;
        
        for (String str : goal) {
            if (oneIdx < cards1.length && str.equals(cards1[oneIdx])) {
                oneIdx++;      
            }               
            else if (twoIdx < cards2.length && str.equals(cards2[twoIdx])) {
                twoIdx++;
            }
            else return "No";
        }
                
        return answer;
    }
}
