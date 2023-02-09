package Programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Num1_29 {
	// 방법1
//	public int solution(int n) {
//		int answer = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        // 10진법 -> 3진법
//        while(n > 0) {
//            list.add(n%3);
//            n = n / 3;
//        } 
//        // 3진법 -> 10진법
//        int tmp = 1;
//        for(int i=list.size()-1;i>=0;i--) {
//            answer += list.get(i)*tmp;
//            tmp *= 3;
//        }
//        return answer;
//    }
	
	// 방법2
	public int solution(int n) {
		int answer = 0;
		String a = Integer.toString(n,3); // int n을 3진법으로 변환해서 String a에 저장
		a = new StringBuilder(a).reverse().toString(); // a를 StringBuilder를 이용해서 뒤집어주고 a에 저장해줌.
		answer = Integer.parseInt(a, 3); // answer에 a값을 3진법에서 int(10진법)로 바꿔서 저장해줌. 
		return answer;
	}
	public static void main(String[] args) {
		Num1_29 T = new Num1_29();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		sc.close();
	}
}
