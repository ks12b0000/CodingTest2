package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class 튜플 {
	public int[] solution(String s) {               
        String[] str = s.split("\\},\\{");
        str[0] = str[0].replaceAll("\\{", "");
        str[str.length - 1] = str[str.length - 1].replaceAll("\\}", "");
        int[] answer = new int[str.length];
        
        Arrays.sort(str, new Comparator<String>() {
        	@Override
        	public int compare(String e1, String e2) {
        		return e1.length() - e2.length();
        	}
		});

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
        	String[] arr = str[i].split(",");
        	for (int j = 0; j < arr.length; j++) {  
        		int k = Integer.parseInt(arr[j]);
        		if (!hashSet.contains(k)) {
        			hashSet.add(k);
        			answer[i] = k;
        		}        		
        	}
        }
        
        return answer;
    }
}