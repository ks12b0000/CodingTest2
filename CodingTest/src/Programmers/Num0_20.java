package Programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Num0_20 {
//	public ArrayList<Integer> solution(int n) {
//		ArrayList<Integer> answer = new ArrayList<>();		// answer를 ArrayList로 해주고
//        for (int i = 1; i <= n; i++) {		
//        	if (n % i == 0) {				// 만약 n % i == 0 이면(0이 나오면 약수이므로) answer에 i를 넣어줌.
//        		answer.add(i);
//        	}
//        }
//        return answer;
//    }
	public int[] solution(int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer.add(i);
			}
		}
		return answer.stream().mapToInt(x -> x).toArray();	// 배열로 출력하기 위해 answer를 List에서 Int로 바꿔주고 배열로 출력해줌.
	}
	public static void main(String[] args) {
		Num0_20 T = new Num0_20();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(T.solution(n));
		for (int x : T.solution(n)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
