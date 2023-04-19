package Programmers;

public class 피로도 {
	static int answer = 0;
	static boolean[] ch;
	public int solution(int k, int[][] dungeons) {
        
		ch = new boolean[dungeons.length];
		DFS(k, dungeons);
        return answer;
    }
	static void DFS(int k, int[][] dungeons) {
		int cnt = 0;
		for (int i = 0; i < dungeons.length; i++) {
			if (ch[i]) {
				cnt++;
				answer = Math.max(cnt, answer);
			}
			else {
				if (dungeons[i][0] <= k) {
					ch[i] = true;
					k -= dungeons[i][1];
					DFS(k, dungeons);
					ch[i] = false;
					k += dungeons[i][1];
				}
			}
		}
	}
}
