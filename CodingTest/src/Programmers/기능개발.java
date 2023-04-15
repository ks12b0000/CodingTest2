package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
//	public int[] solution(int[] progresses, int[] speeds) {
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        
//        Queue<Integer> arr = new LinkedList<Integer>();
//        
//        for (int i = 0; i < progresses.length; i++) {
//        	if ((100 - progresses[i]) % speeds[i] != 0) {
//        		arr.add(((100 - progresses[i]) / speeds[i]) + 1);
//        	}
//        	else {
//        		arr.add((100 - progresses[i]) / speeds[i]);
//        	}
//        }
//        for (int x : arr) {
//        	System.out.println(x);
//        }
//        int cnt = 1;
//        while (!arr.isEmpty()) {
//        	int a = arr.poll();
//        	if (arr.isEmpty()) {
//        		cnt++;
//        		answer.add(cnt);
//        		break;
//        	}
//        	if (a < arr.peek()) {
//        		answer.add(cnt);
//        		cnt = 1;
//        		continue;
//        	}
//        	else if (a >= arr.peek()) {
//                while (a < arr.peek()) {
//                    cnt++;
//                    arr.poll();
//                } 
//                answer.add(cnt);
//                cnt = 1;
//            }
//                   		
//        	
//        }
//        
//        return answer.stream().mapToInt(x -> x).toArray();
//    }
	// 다시
}
