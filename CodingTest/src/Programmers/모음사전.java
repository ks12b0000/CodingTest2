package Programmers;

import java.util.ArrayList;

public class 모음사전 {
	static char[] words = {'A', 'E', 'I', 'O', 'U'};
	public int solution(String word) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < words.length; i++) {
        	DFS(list, words[i] + "");
        }
        
        for (int i = 0; i < list.size(); i++) {
        	if (list.get(i).equals(word)) {
        		answer = i + 1;
        		break;
        	}
        }
        
        return answer;
    }
	static void DFS(ArrayList<String> list, String str) {
		if (str.length() > 5) return;
		if (!list.contains(str)) {
			list.add(str);
		}
		
		for (int i = 0; i < words.length; i++) {
			DFS(list, str + words[i]);
		}
	}
}
