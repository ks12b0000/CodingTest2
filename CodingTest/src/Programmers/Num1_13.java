package Programmers;

import java.util.Scanner;

public class Num1_13 {
	public int solution(String[] babbling) {
        int answer = 0;
       
        for (int i = 0; i < babbling.length; i++) {
        	if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
        		continue;
        	}
        	babbling[i] = babbling[i].replaceAll("aya|yeye|woo|ma", "");
        	if (babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_13 T = new Num1_13();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] babbling = new String[num];
		for (int i = 0; i < num; i++) {
			babbling[i] = sc.next();
		}
		System.out.println(T.solution(babbling));
		sc.close();
	}

}
