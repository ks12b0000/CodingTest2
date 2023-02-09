package Programmers;

import java.util.Scanner;

public class Num1_25 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] win = {6, 6, 5, 4, 3, 2, 1}; // 일치하는 번호가 있으면 카운트 늘리면서 win에서 등수 나타내줌.
        // ex) 0,1개 맞으면 6등 2개 5등, 3개 4등, 4개 3등, 5개 2등, 6개 1등.
        int maxCnt = 0; // 제일 높은 등수에서 맞은 개수 저장하기위해
        int minCnt = 0; // 제일 낮은 등수에서 맞은 개수 저장하기위해
        
        for (int i = 0; i < 6; i++) {
        	if (lottos[i] == 0) { // lottos[i] 가 0이면 로또번호를 일치하게 만들 수 있으므로 maxCnt++(제일 낮은 등수 구할땐 0이면 틀리게 계산)
        		maxCnt++;
        	}
        	for (int j = 0; j < 6; j++) {
        		if (lottos[i] == win_nums[j]) { // lottos[i] 가 win_nums[j] 랑 같으면 일치하는 횟수 ++ 해줌
        			maxCnt++;
        			minCnt++;
        		}
        	}
        }
        
        answer[0] = win[maxCnt]; // answer[0]에 제일 높은 등수
        answer[1] = win[minCnt]; // answer[1]에 제일 낮은 등수
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_25 T = new Num1_25();
		Scanner sc = new Scanner(System.in);
		int[] lottos = new int[6];
		int[] win_nums = new int[6];
		for (int i = 0; i < 6; i++) {
			lottos[i] = sc.nextInt();
		}		
		for (int i = 0; i < 6; i++) {
			win_nums[i] = sc.nextInt();
		}
		for (int x : T.solution(lottos, win_nums)) {
			System.out.println(x + " ");
		}
	}
}
