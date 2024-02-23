package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 여행경로 {
	static ArrayList<String> list = new ArrayList<>();
	static boolean[] visit;
    public String[] solution(String[][] tickets) {        
        visit = new boolean[tickets.length];
                
        dfs(0, tickets, "ICN", "ICN");
        
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        
        return answer;
    }
    static void dfs(int cnt, String[][] tickets, String start, String word) {
        if (cnt == tickets.length) {
        	list.add(word);
        	return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
        	if (!visit[i] && tickets[i][0].equals(start)) {
        		visit[i] = true;
        		dfs(cnt + 1, tickets, tickets[i][1], word + " " + tickets[i][1]);
        		visit[i] = false;
        	}
        }
    }
}
