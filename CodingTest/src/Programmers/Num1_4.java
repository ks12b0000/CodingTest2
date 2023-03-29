package Programmers;

import java.util.Scanner;

public class Num1_4 {
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        int next = section[0];
        int idx = 0;
        while(idx < section.length) {
            if (next <= section[idx]) {
                next = section[idx] + m;
                answer++;
            }
            idx++;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_4 T = new Num1_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] section = new int[c];
		
		for (int i = 0; i < c; i++) {
			section[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, section));
		
		sc.close();
	}
}
