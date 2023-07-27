package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 베스트앨범 {
	public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();       
        HashMap<Integer, String> map3 = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            map2.put(plays[i], genres[i]);
        }       
        
        for (String key : map.keySet()) {
            map3.put(map.get(key), key);
        }
        
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        
        ArrayList<Integer> keyList = new ArrayList<>(map2.keySet());
        Collections.sort(keyList, Collections.reverseOrder());
        
        for (int key : valueList) {
            String str = map3.get(key);
            int cnt = 0;
            for (int list : keyList) {
                if (map2.get(list).equals(str)) {
                    for (int i = 0; i < plays.length; i++) {
                        if (list == plays[i]) {
                            cnt++;
                            answer.add(i);
                        }
                    }
                    if (cnt >= 2) break;
                }
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
