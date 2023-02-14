package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Num0_28 {
	
	// 방법 1 직접 가장 큰 값 구함
//	public int solution(int[] sides) {
//        int answer = 0;
//        int max = 0;
//        int num = 0;
//        for (int i = 0; i < sides.length; i++) {
//            max = Math.max(sides[i], max); // sides에서 제일 큰 값을 max에 저장
//            num += sides[i]; // num에 sides값들을 다 저장
//        }
//        num = num - max; // num = 다 더한 값 - 제일 큰 값
//        if (num <= max) { // num이 제일 큰 값보다 작거나 같으면 answer = 2
//            answer = 2;
//        }
//        else { // num이 제일 큰 값보다 크면 answer = 1
//            answer = 1;
//        }
//        return answer;
//    }
	
	// 방법 2 sides의 길이는 3입니다. 라고 되어 있으므로 Arrays.sort를 이용해서 정렬 후 검증
	public int solution (int[] sides) {
		int answer = 0;
		 
		Arrays.sort(sides); // 정렬해줌
		
		if (sides[2] >= sides[0] + sides[1]) { // 만약 제일 큰 값이 나머지 두 변의 합보다 크거나 같으면 answer = 2
			answer = 2;
		}
		else { // 작으면 answer = 1
			answer = 1;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num0_28 T = new Num0_28();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] sides = new int[num];
		for (int i = 0; i < num; i++) {
			sides[i] = sc.nextInt();
		}
		System.out.println(T.solution(sides));
		sc.close();
	}
}
