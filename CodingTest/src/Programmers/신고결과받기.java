package Programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> hashMap = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        
        for (int i = 0; i < id_list.length; i++) {
        	hashMap.put(id_list[i], new HashSet<String>());
        	hashMap2.put(id_list[i], i);
        }
        
        for (int i = 0; i < report.length; i++) {
        	String[] str = report[i].split(" ");
        	hashMap.get(str[1]).add(str[0]);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = hashMap.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[hashMap2.get(name)]++;
                }
            }
        }
        
        return answer;
    }
}
