package DoitBook;

import java.util.Scanner;

public class Num001 {
	public int solution (int n, String n2) {
		int answer = 0;		
		char[] n2Arr = n2.toCharArray(); // n2를 char배열에 담아줌
		
		for (int i = 0; i < n2Arr.length; i++) {
			answer += n2Arr[i] - '0'; // answer에 n2Arr[i]번째 문자를 - '0' 빼서 저장(-0 을 해줘야 뺀 숫자값 나옴)
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num001 T = new Num001();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String n2 = sc.next();		
		System.out.println(T.solution(n, n2));
		sc.close();
	}
}
