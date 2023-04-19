package Programmers;

public class 타겟넘버 {
	static int answer = 0;
	public int solution(int[] numbers, int target) {        
        
        DFS(numbers, target, 0, 0);
		
        return answer;
    }
	static void DFS(int[] numbers, int target, int sum, int idx) {
		if (idx == numbers.length) {
			if (sum == target) {
				answer++;
			}
			return;
		}
		
		DFS(numbers, target, sum + numbers[idx], idx + 1);
		DFS(numbers, target, sum - numbers[idx], idx + 1);
	}
}
