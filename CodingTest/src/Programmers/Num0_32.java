package Programmers;

import java.util.Scanner;

public class Num0_32 {
	public String solution(String bin1, String bin2) {
        String answer = "";
 
        int c = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2); // int c에 bin1, bin2를 2진수로 변환해서 더한 값 저장.
        
        answer = Integer.toString(c,2); // answer에 c를 2진수로 변환한 값을 String으로 변환해서 저장해
        
        return answer;
    }
	public static void main(String[] args) { 
		Num0_32 T = new Num0_32();
		Scanner sc = new Scanner(System.in);
		String bin1 = sc.next();
		String bin2 = sc.next();
		System.out.println(T.solution(bin1, bin2));
		sc.close();
	}
}
