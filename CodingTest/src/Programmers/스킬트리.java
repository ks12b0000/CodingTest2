package Programmers;

import java.util.ArrayList;

public class 스킬트리 {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<String>();
        
        for (int i = 0; i < skill_trees.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	for (int j = 0; j < skill_trees[i].length(); j++) {
        		if (skill.contains(skill_trees[i].charAt(j) + "")) {
        			sb.append(skill_trees[i].charAt(j) + "");
        		}
        	}
        	arr.add(sb.toString());
        }
        
        for (String x : arr) {
        	if (skill.startsWith(x)) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
