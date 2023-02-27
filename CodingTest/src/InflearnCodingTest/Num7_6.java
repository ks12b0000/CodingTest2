package InflearnCodingTest;

public class Num7_6 {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if(ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			if (tmp.length() > 0) { // 공집합이 아닐경우 출력
				System.out.println(tmp);
			}
		}
		else {
			ch[L] = 1; // L의 원소를 사용하면 1
			DFS(L + 1); // 왼쪽으로 뻗어나감(사용 O)
			ch[L] = 0; // L의 원소를 사용안하면 0
			DFS(L + 1); // 오른쪽으로 뻗어나감 (사용 X)
		}
	}
	public static void main(String[] args) {
		Num7_6 T = new Num7_6();
		n = 3;
		ch = new int[n + 1]; // DFS는 1번째 부터 시작하므로 배열0번째는 버림
		T.DFS(1);
	}

}
