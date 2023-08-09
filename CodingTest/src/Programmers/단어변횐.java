package Programmers;

public class 단어변횐 {
	static boolean[] ch;
    static int answer = 0;
	public int solution(String begin, String target, String[] words) {       
        ch = new boolean[words.length];
        
        DFS(begin, target, words, 0);
        
        return answer;
    }
    static void DFS(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (ch[i]) continue;

            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) { 
                ch[i] = true;
                DFS(words[i], target, words, cnt + 1);
                ch[i] = false;
            }
        }
    }
}
