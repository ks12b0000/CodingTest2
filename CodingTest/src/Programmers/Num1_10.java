package Programmers;


import java.util.Arrays;
import java.util.Scanner;

public class Num1_10 {
	public int solution(int k, int m, int[] score) { // ex) score = [1, 2, 3, 1, 2, 3, 1], m = 4, k = 3
        int answer = 0;
        int index = 0;
        Arrays.sort(score); // 1. score배열을 정렬 해주고, [1, 1, 1, 2, 2, 3, 3]
        int[] tScore = new int[score.length]; 
        
        for (int i = 0; i < tScore.length; i++) { // 2. tScore배열에 score배열을 정렬한 부분을 오름차순으로 저장해준다.
        	tScore[i] = score[score.length - 1 - i]; // [3, 3, 2, 2, 1, 1, 1]
        }
        
        while(true) {
        	if (index >= tScore.length || index + m > tScore.length) { // 3. index가 tScore길이랑 같거다 크면 멈추고, index + m이 tScore길이보다 크면 멈춤
        		break;
        	}
        	answer += tScore[index + m - 1] * m; // 4. answer에 tScore[index + m -1]값 * m을 해서 더해줌.
        	index += m; // 5. wile문 한번 돌때마다 index에 m을 더해줌.
        }
        // tScore[index + m - 1] * m = tScore[3] * 4 = 8
        // index = 4
        // index + m의 값이 tScore의 길이보다 크니까 종료.
        
        return answer;
        
        
        
        // ex) k = 4, m = 3, score = [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]
        // 1. [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
        // 2. [4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 1, 1] tScore.length = 12
        // 3. 해당X
        // 4. tScore[0 + 3 - 1] * m = tScore[2] * 3 = 4 * 3 = 12 answer = 12
        // 5. index = 3
        
        // 3. 해당X
        // 4. tScore[3 + 3 - 1] * m = tScore[5] * 3 = 4 * 3 = 12 answer = 24
        // 5 = index = 6
        
        // 3. 해당X
        // 4. tScore[6 + 3 - 1] * m = tScore[8] * 3 = 2 * 3 = 6 answer = 30
        // 5 = index = 9
        
        // 3. 해당X
        // 4. tScore[9 + 3 - 1] * m = tScore[11] * 3 = 1 * 3 = 3 answer = 33
        // 5. index = 12
        
        // 3. 12 >= 12 이므로 종료.
        // answer = 33
    }
	public static void main(String[] args) {
		Num1_10 T = new Num1_10();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		int num = sc.nextInt();
		int[] score = new int[num];
		for (int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
		}
		System.out.println(T.solution(k, m, score));
		sc.close();
	}
}
