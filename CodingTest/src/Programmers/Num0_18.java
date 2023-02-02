package Programmers;

import java.util.Scanner;

public class Num0_18 {
	public int[] solution(int[] array) {
		int[] answer = new int[2];			// answer 배열에는 제일 큰 값, 인덱스 값 2개 들어가야 하므로 2개 만듦.
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {			// 만약 array[i]가 max 보다 크면 max에 array[i] 값을 넣어주고 index에 i를 넣어준다
				max = array[i];				// ex) array가 [9,10,11,8] 일 때 array[0] = 9 > 0, max = 9, index = 0
				index = i;					// array[1] = 10 > 9, max = 10, index = 1, 
			}								// array[2] = 11 > 10, max = 11, index = 2, 
		}									// array[3] = 8 > 11, max = 11, index = 2 가 된다.
		
		answer[0] = max;
		answer[1] = index;
		
		
		return answer;
	}
	public static void main(String[] args) {
		Num0_18 T = new Num0_18();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		for (int x : T.solution(array)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
