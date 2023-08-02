package Programmers;

import java.util.ArrayList;

public class 모음사전 {
	static char[] words = {'A', 'E', 'I', 'O', 'U'};
    static ArrayList<String> list = new ArrayList<>();
    static int answer;
    public int solution(String word) {
        
        for (char x : words) {
            DFS(x + "");
        }
        
        for (String str : list) {
            answer++;
            if (str.equals(word)) break;
        }
        
        return answer;
    }
    static void DFS(String str) {
        if (str.length() > 5) return;
        if (!list.contains(str)) {
            list.add(str);
        }
        for (char x : words) {
            DFS(str + x);
        }
    }
}
