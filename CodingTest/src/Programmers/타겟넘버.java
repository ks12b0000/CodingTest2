package Programmers;

public class 타겟넘버 {
	static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return answer;
    }

    static void dfs(int index, int[] num, int target, int sum) {
        if (index == num.length) {
            if (target == sum) {
                answer++;
            }
            return;
        }
        
        dfs(index + 1, num, target, sum + num[index]);
        dfs(index + 1, num, target, sum - num[index]);
    }
}
