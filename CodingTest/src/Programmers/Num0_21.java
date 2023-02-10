package Programmers;


import java.util.Arrays;
import java.util.Scanner;

public class Num0_21 {
	public String solution(String s) {
        String answer = "";  
        char[] c = s.toCharArray(); // 문자배열 c에 s문자들 담음.
        Arrays.sort(c); // 문자들을 정렬해주고
        
        for (int i = 0; i < c.length; i++) {
        	int cnt = 0;
        	for (int j = 0; j < c.length; j++) {
        		if (c[i] == c[j]) { // c[i] == c[j]랑 같으면 cnt++
        			cnt++;
        		}
        	}
        	if (cnt == 1) { // cnt == 1이 되면 answer에 c[i] 값을 넣어줌(1번만 들어가있는 문자)
        		answer += c[i];
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_21 T = new Num0_21();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
		sc.close();
	}
}
