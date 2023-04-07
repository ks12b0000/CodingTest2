package Programmers;


public class 연속된부분수열의합 {
	public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0, right = 0;
        int sum = 0, min = Integer.MAX_VALUE;

        while (right < sequence.length) {
            sum += sequence[right++];

            while (sum > k) {
                sum -= sequence[left++];
            }

            if (sum == k && right - left < min) {
            	min = right - left;
                answer[0] = left;
                answer[1] = right - 1;
            }
        }

        return answer;
    }
}