package Programmers;

import java.util.Scanner;

public class Num0_15 {
	public int solution(int num, int k) {
        int answer = 0;
        
//        String str = Integer.toString(num);			// str에 num을 String으로 변환 후 저장하고
//        answer = str.indexOf(Integer.toString(k));	// answer에 str 문자열 안에 k가 어느지점에 있는지 구해줌
//        
//        if (answer != -1) {							// answer가 -1이 아니면 answer를 1증가 시켜줌(자리수가 1부터 시작하는 걸로 되어있으므로)
//        	answer++;									// str문자열 안에 k가 없으면 -1이 나옴
//        }
        answer = (" " + num).indexOf(String.valueOf(k));	// 한 줄 풀이로 (" " + num) 빈 문자열을 0번째 자리수에 넣어서 숫자들의 자리수를 1부터 구하도록 만듦
        													// 문자열 + 숫자 = 문자열이 됨. (" " + num) 문자열에서 (k를 String으로 변환 후) 어느지점에 있는지 구함.
        return answer;
    }
	public static void main(String[] args) {
		Num0_15 T = new Num0_15();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(num, k));
		sc.close();
	}
}
