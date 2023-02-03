package Programmers;

import java.util.Scanner;

public class Num1_5 {
	public int solution(String t, String p) {
        int answer = 0; // t.length() - p.length() + 1을 한 이유는 t의 길이 - p의 길이 + 1을 하면 p의 길이만큼 t에서 몇번 검증해야 하는지 나오기 때문 
        for (int i = 0; i < t.length() - p.length() + 1; i++) { // 1 ≤ p의 길이 ≤ 18 이므로 t와p의 값이 int의 최대값인 2147483647보다 클 경우가 있을 수 있어서  	
        	if (Long.parseLong(t.substring(i, p.length() + i)) <= Long.parseLong(p)) { // int로 담기지 않으니까 Long으로 변환해서 검증해줌. 
        		answer++; // 만약 t의 문자열에서 i 부터 p의 길이 + i를 Long으로 변환한 값이 p를 Long으로 변환한 값 보다 작거나 같으면 answer++ 해줌
        	} // t.substring(i, p.length() + i)를 한 이유는 substring 처음 위치가 늘어날수록 뒤에 위치도 i만큼 늘어나야 하기 때문에.
        }    
        return answer;
    }
	public static void main(String[] args) {
		Num1_5 T = new Num1_5();
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String p = sc.next();
		System.out.println(T.solution(t, p));
		sc.close();
	}
}
