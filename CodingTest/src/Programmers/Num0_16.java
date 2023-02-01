package Programmers;

import java.util.Scanner;

public class Num0_16 {
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {		// ex) s1 = [a,b,c], s2 = [com,b,d,p,c]
        	for (int j = 0; j < s2.length; j++) {	
        		if (s1[i].equals(s2[j])) {			// s1[i]값이 s2[j]랑 같으면 answer 1증가
        			answer++;						// s1[0].equals(s2[0~4]), s1[1].equals(s2[0~4]), s1[2].equals(s2[0~4])
        		}									// answer = b,c가 같으므로 2
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_16 T = new Num0_16();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		String[] s1 = new String[num];
		String[] s2 = new String[num2];
		for (int i = 0; i < num; i++) {
			s1[i] = sc.next();
		}
		for (int j = 0; j < num2; j++) {
			s2[j] = sc.next();
		}
		System.out.println(T.solution(s1, s2));
		sc.close();
	}
}
