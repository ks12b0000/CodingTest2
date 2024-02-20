package Programmers;

public class 기지국설치 {
	public int solution(int n, int[] stations, int w) {
        int answer = 0;
             
        int idx = 1;
        int stationIdx = 0;
        
        while (idx <= n) {
            if (stationIdx < stations.length && stations[stationIdx] - w <= idx) {
                idx = stations[stationIdx] + w + 1;
                stationIdx++;
            } else {
                answer++;
                idx += w * 2 + 1;
            }
        }
        
        return answer;
    }
}
