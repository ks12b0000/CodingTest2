package Programmers;

public class Num0_37 {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] arr = new int[200];
		
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]; j < lines[i][1]; j++) {
				arr[j]++;
			}
		}
		
		for (int i = 0; i < 200; i++) {
			if (arr[i] > 1) answer++;
		}
		
		return answer;
	}
}	
