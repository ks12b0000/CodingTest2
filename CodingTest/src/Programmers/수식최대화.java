package Programmers;

import java.util.ArrayList;

public class 수식최대화 {
	static long answer;
    static char[] op = {'+', '-', '*'};
    static boolean[] ch = new boolean[3];
    static ArrayList<Character> list = new ArrayList<>();
    static ArrayList<Long> numList = new ArrayList<>();
    public long solution(String expression) {
        answer = 0;
        
        String str = "";
        for (char c : expression.toCharArray()) {
            if (c == '-' || c == '+' || c == '*') {
                list.add(c);
                numList.add(Long.parseLong(str));
                str = "";
            }
            else {
                str += c;
            }
        }
        numList.add(Long.parseLong(str));
        
        DFS(0, new char[3]);
        
        return answer;
    }
    static void DFS(int cnt, char[] c) {
        if (cnt == 3) {
            ArrayList<Character> arrList = new ArrayList<>(list);
            ArrayList<Long> arrNumList = new ArrayList<>(numList);
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < arrList.size(); j++) {
                    if (c[i] == arrList.get(j)) {
                        long tmp = calc(arrNumList.remove(j), arrNumList.remove(j), c[i]);
                        arrNumList.add(j, tmp);
                        arrList.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(arrNumList.get(0)));
            return;
        }
        
        for (int i = 0; i < 3; i++) {
            if (!ch[i]) {
                ch[i] = true;
                c[cnt] = op[i];
                DFS(cnt + 1, c);
                ch[i] = false;
            }
        }
    }
    static long calc(long num1, long num2, char op) {
        if (op == '+') {
            return num1 + num2;
        }
        else if (op == '-') {
            return num1 - num2;
        }
        return num1 * num2;
    }
}
