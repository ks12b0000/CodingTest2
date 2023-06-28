package Programmers;
import java.util.*;

public class 파일명정렬2 {
	public String[] solution(String[] files) {
        String[] answer = new String[files.length];   
               
        Arrays.sort(files, new Comparator<String>() {

			@Override
			public int compare(String e1, String e2) {
				String[] o1 = sort(e1);
				String[] o2 = sort(e2);
				if (o1[0].toString().contentEquals(o2[0].toString())) {
					int a = Integer.parseInt(o1[1]);
					int b = Integer.parseInt(o2[1]);
					return a - b;
				}
				else {
					return o1[0].toString().compareTo(o2[0].toString());
				}
			}
		});
        
        for (int i = 0; i < files.length; i++) {
        	answer[i] = files[i];
        }
        
        return answer;
    }
	static String[] sort(String s) {
		String[] str = new String[3];
		for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    			str[0] = s.substring(0, i).toLowerCase();
    			str[1] = s.substring(i, s.length());
    			for (int k = 0; k < str[1].length(); k++) {
    				if (str[1].charAt(k) == '.' || str[1].charAt(k) == '-' || str[1].charAt(k) == ' ' || Character.isAlphabetic(str[1].charAt(k))) {
    					str[2] = str[1].substring(k, str[1].length());
    					str[1] = str[1].substring(0, k);
    					break;
    				}
    			}
    			break;
    		}       	
        }
		return str;
	}
}
