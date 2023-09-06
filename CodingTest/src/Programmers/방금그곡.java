package Programmers;

public class 방금그곡 {
	public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        m = convert(m);
        int max = 0;
        
        for (int i = 0; i < musicinfos.length; i++) {
            String[] arr = musicinfos[i].split(",");
            int hh = Integer.parseInt(arr[0].substring(0, 2)) * 60;
            int mm = Integer.parseInt(arr[0].substring(3, 5)) + hh;
            int hh2 = Integer.parseInt(arr[1].substring(0, 2)) * 60;
            int mm2 = Integer.parseInt(arr[1].substring(3, 5)) + hh2;
            
            int minit = mm2 - mm;
            
            arr[3] = convert(arr[3]);
            
            while (arr[3].length() < minit) {
                arr[3] += arr[3];
            }

            if (arr[3].length() > minit) {
                arr[3] = arr[3].substring(0, minit);
            }
            
            if (arr[3].contains(m)) {  
                if (max < minit) { 
                    max = minit;
                    answer = arr[2];
                }
            }
        }
        
        return answer;
    }
    private String convert(String m) {
        m = m.replaceAll("A#", "a");
        m = m.replaceAll("C#", "c");
        m = m.replaceAll("D#", "d");
        m = m.replaceAll("F#", "f");
        m = m.replaceAll("G#", "g");
        return m;
    }
}
