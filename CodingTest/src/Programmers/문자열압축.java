package Programmers;

public class 문자열압축 {
	public int solution(String s) {
        int answer = s.length();
        int len = s.length() / 2;
        int cnt = 1;
        
        for (int i = 1; i <= len; i++) {
            String before = s.substring(0, i);
            String tmp = "";
            
            for (int j = i; j <= s.length(); j+=i) {
                int end = Math.min(j + i, s.length());
                String str = s.substring(j, end);
                if (before.equals(str)) {
                    cnt++;
                }
                else {
                    if (cnt > 1) {
                        tmp += cnt;
                    }
                    tmp += before;
                    before = str;
                    cnt = 1;
                }
            }
            tmp += before;
            answer = Math.min(answer, tmp.length());
        }
        return answer;
    }
}
