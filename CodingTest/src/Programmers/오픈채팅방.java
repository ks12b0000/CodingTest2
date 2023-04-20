package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {
	public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<String>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String[][] str = new String[record.length][3];
        
        for (int i = 0; i < record.length; i++) {
        	str[i] = record[i].split(" ");
        }
       
        for (int i = 0; i < str.length; i++) {
        	if (str[i][0].equals("Enter")) {        		
        		hashMap.put(str[i][1], str[i][2]);
        	}
        	else if (str[i][0].equals("Change")) {
        		hashMap.put(str[i][1], str[i][2]);
        	}
        }
        
        for (int i = 0; i < str.length; i++) {
        	if (str[i][0].equals("Enter")) {        		
        		answer.add(hashMap.get(str[i][1]) + "님이 들어왔습니다.");
        	}
        	else if (str[i][0].equals("Leave")) {
        		answer.add(hashMap.get(str[i][1]) + "님이 나갔습니다.");
        	}
        }
        
        return answer.stream().toArray(String[]::new);
    }
}
