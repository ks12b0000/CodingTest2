package Programmers;

import java.util.ArrayList;

public class 불량사용자 {
	static ArrayList<ArrayList<String>> list = new ArrayList<>();
	static boolean[] check;
	public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        check = new boolean[user_id.length];
        
        DFS(user_id, banned_id, 0, 0);
        
        answer = list.size();
        
        return answer;
    }
	static void DFS(String[] user_id, String[] banned_id, int start, int cnt) {
		if (cnt == banned_id.length) {
            ArrayList<String> list2 = new ArrayList<>();
            for (int i = 0; i< check.length; i++) {
                if(check[i]) {
                    list2.add(user_id[i]);
                }
            }
            if (!list.contains(list2)) {
            	list.add(list2);
            }
            return;
        }
		for (int i = start; i< banned_id.length; i++) {
            for (int j = 0; j< user_id.length; j++) {
                String banned = banned_id[i];
                String user = user_id[j];

                boolean checked = true;
                if (banned.length() != user.length()) checked = false;
                else {
                    for (int k = 0; k<banned.length(); k++) {
                        if (banned.charAt(k) == '*') continue;
                        if (banned.charAt(k) != user.charAt(k)) {
                            checked = false;
                            break;
                        }
                    }
                }

                if(checked && !check[j]) {
                	check[j] = true;
                    DFS(user_id, banned_id, i + 1, cnt + 1);
                    check[j] = false;
                }
            }
        }
	}
}
