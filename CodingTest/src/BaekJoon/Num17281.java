package BaekJoon;

import java.util.Scanner;

public class Num17281 {
	static int n;
	static int[][] players;
	static boolean[] ch;
	static int[] lineUp;
	static int answer = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		players = new int[n + 1][10];
		// 선수 순서 정하기 위함
		ch = new boolean[10];
		lineUp = new int[10];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 9; j++) {
				players[i][j] = sc.nextInt();
			}
		}
		
		lineUp[4] = 1; // 1번 선수를 4번 타자로 미리 결정했으므로
		ch[4] = true; // 4번자리 넣어뒀으니 true로 설정
		
		perm(2); // 1번 선수는 정해졌으므로 2번부터 시작
		
		System.out.println(answer);
		
		sc.close();
	}
	// 선수 순서 정하기 위해
	static void perm(int num) {
		// 선수 다 채웠으면 야구게임 실행
		if (num == 10) {
			play();
			return;
		}
		
		// 현재 선수를 1번 ~ 9번까지 넣음
		for (int i = 1; i <= 9; i++) {
			if (ch[i]) {
				continue;
			}
			ch[i] = true;
			lineUp[i] = num;
			perm(num + 1);
			ch[i] = false;
		}
	}
	static void play() {
		int score = 0; // 점수
		int start = 1; // 1번 타자부터 start
		
		for (int i = 1; i <= n; i++) {
			int outCnt = 0; // 아웃카운트
			boolean[] base = new boolean[4]; // 1 ~ 3번 베이스에 선수 있는지 확인
			
			while (outCnt < 3) { // 3아웃 되면 멈춤
				int hitter = players[i][lineUp[start++]];
				
				if (hitter == 0) { // 아웃되면 아웃카운트++
					outCnt++;
				}
				else if (hitter == 1) { // 1루타 되면 
					for (int k = 3; k >= 1; k--) { // 3베이스부터 확인해서 베이스에 선수가 있으면 한칸씩 이동 후 홈 들어오면 점수++
						if (base[k]) {				// 베이스를 한칸 이동했으므로 현재 베이스는 비어두고 다음 베이스로 이동처리
							if (k == 3) {
								score++;
								base[k] = false;
								continue;
							}
							base[k] = false;
							base[k + 1] = true;
						}
					}
					base[1] = true; // 타자가 1루타 치면 1루로 이동하므로
				}
				else if (hitter == 2) { // 2루타 되면
					for (int k = 3; k >= 1; k--) { // 3베이스부터 확인해서 베이스에 선수가 있으면 두칸씩 이동 후 홈 들어오면 점수++ 
						if (base[k]) {				// 베이스를 두칸 이동했으므로 현재 베이스는 비어두고 2칸 이동한 베이스로 이동처리
							if (k == 3 || k == 2) {
								score++;
								base[k] = false;
								continue;
							}
							base[k] = false;
							base[k + 2] = true;
						}
					}
					base[2] = true; // 타자가 2루타 치면 2루로 이동하므로
				}
				else if (hitter == 3) { // 3루타 되면 베이스에 있는 모든 선수가 홈으로 들어오므로
					for (int k = 3; k >= 1; k--) { // 베이스에 선수가 있으면 점수++ 
						if (base[k]) {				// 현재 베이스 비어둠 
							score++;
							base[k] = false;
						}
					}
					base[3] = true; // 타자가 3루타 치면 3루로 이동하므로
				}
				else if (hitter == 4) { // 홈런되면 베이스에 있는 모든 선수가 홈으로 들어오므로
					for (int k = 1; k <= 3; k++) { // 베이스에 선수가 있으면 점수++
						if (base[k]) {				// 현재 베이스 비어둠
							score++;
							base[k] = false;
						}
					}
					score++; // 타자가 홈런치면 홈으로 들어오므로 점수++
				}
				if (start >= 10) start = 1; // 9번 타자까지 쳤으면 1번 타자부터 시작
			
			}
		}
		answer = Math.max(answer, score);
	}
}
