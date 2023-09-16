package Programmers;


public class 징검다리건너기 {
	public int solution(int[] stones, int k) {
        int answer = 0;
        
        int min = 0;
        int max = 200000000;
        
        while (min <= max) {
            int mid = (min + max) / 2;
            if (check(stones, k, mid)) {
                min = mid + 1;
                answer = mid;
            }
            else {
                max = mid - 1;
            }
        }
        
        return answer;
    }
    static boolean check(int[] stones, int k, int mid) {
        int cnt = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] < mid) {
                cnt++;
                if (cnt == k) return false;
            }
            else {
                cnt = 0;
            }
        }
        return true;
    }
}
