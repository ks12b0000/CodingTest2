package Programmers;

public class 신규아이디추천 {
	public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9_.-]", "");
        StringBuilder sb = new StringBuilder(new_id);
        
        if (new_id.contains(".")) {
        	for (int i = 0; i < new_id.length() - 1; i++) {
        		if (new_id.charAt(i) == '.' && new_id.charAt(i + 1) == '.') {
        			sb.deleteCharAt(i);
                    i--;
                    new_id = sb.toString();
        		}                
        	}
        }
        
        if (new_id.startsWith(".")) {
        	new_id = new_id.substring(1, new_id.length());
        }
        if (new_id.length() > 1) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
        	    new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        if (new_id.equals("")) {
            new_id = "a";
        }
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.') {
        	    new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        if (new_id.length() <= 2) {
            while (new_id.length() != 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        
        answer = new_id;
        
        return answer;
    }
}
