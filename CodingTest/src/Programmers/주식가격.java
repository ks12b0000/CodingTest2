package Programmers;

import java.util.Stack;

public class 주식가격 {
	
	// 방법 1 stack 사용
//	public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        Stack<Integer> stack = new Stack<Integer>();
//        
//        for (int i = 0; i < prices.length; i++) {
//        	int cnt = 0;
//        	stack.add(prices[i]);
//        	for (int j = i + 1; j < prices.length; j++) { 
//                if (stack.peek() <= prices[j]) {
//                    cnt++;
//                }
//                else {
//                    cnt++;
//                    break;
//                }            	
//        	}    
//        	answer[i] = cnt;
//        }
//        
//        return answer;
//    }
	
	// 방법 2 stack 사용x
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
        	int cnt = 0;
        	for (int j = i + 1; j < prices.length; j++) { 
                if (prices[i] <= prices[j]) {
                    cnt++;
                }
                else {
                    cnt++;
                    break;
                }            	
        	}    
        	answer[i] = cnt;
        }
        
        return answer;
    }
}
