package Programmers;

import java.util.Arrays;

public class 파일명정렬 {
	public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {

            String[] part1 = modPart(o1);
            String[] part2 = modPart(o2);

            int headComparing = part1[0].compareTo(part2[0]);
            int numberComparing = Integer.parseInt(part1[1]) - Integer.parseInt(part2[1]);

            if (headComparing == 0) {
                if (numberComparing == 0) {
                    return 0;
                }
                return numberComparing;
            }
            return headComparing;
        });

        return files;
    }
	static String[] modPart(String s) {
		String[] str = new String[3];
		
		for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    			str[0] = s.substring(0, i).toLowerCase();
    			str[1] = s.substring(i, s.length());
    			for (int k = 0; k < str[1].length(); k++) {
    				if (Character.isAlphabetic(str[1].charAt(k)) || str[1].charAt(k) == '.' || str[1].charAt(k) == '-' || str[1].charAt(k) == ' ') {
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
