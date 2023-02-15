package Programmers;


public class Num0_35 {
	public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length]; // int -> double 한 이유 = [1,3],[2,3]이런게 나오면 int로 계산하면 2로 됨 
        for (int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0; // avg[i]에 평균값 넣어줌
        }
        for (int i = 0; i < avg.length; i++) {
			int rank = 1;
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j]) { // avg[i]가 avg[j]보다 작으면 rank증가
					rank++;
				}
			}
			answer[i] = rank; // answer[i]에 rank값 저장
		}
        
        return answer;
    }
}
