package Programmers;

import java.util.List;
import java.util.ArrayList;

class Test {
    public String[] solution(String[] history, String[][] option, String keyword) {
        List<String> list = new ArrayList<String>();
        if (option[0][0].equals("W") && option[0][1].equals("T")) {
            for (int i = 0; i < history.length; i++) {
                if (history[i].contains(keyword)) {
                	list.add(history[i]);
                }
            }
        }
        if (list.size() == 0) {
        	list.add("empty");
        }
        String answer[] = list.toArray(new String[list.size()]);
        
        return answer;
    }
}
