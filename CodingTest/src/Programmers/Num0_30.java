package Programmers;

import java.util.Scanner;

public class Num0_30 {
	public int solution(int i, int j, int k) {
        int answer = 0;
        String str = Integer.toString(k); // str에 k를 String으로 변환 후 저장
        for(int q = i; q <= j; q++) { // i ~ j까지
        	for (int v = 0; v < Integer.toString(q).length(); v++) { // 0 ~ q의 길이 전까지
        		if (Integer.toString(q).charAt(v) == str.charAt(0)) { // 만약 i ~ j까지문자열에서 0 ~ q의 길이 전까지 문자가 str 값이랑 같으면 answer 증가
                	answer++;
                }
        	}          
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_30 T = new Num0_30();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(i, j, k));
		sc.close();
	}
}
