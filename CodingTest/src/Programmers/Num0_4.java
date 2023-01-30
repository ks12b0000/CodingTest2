package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num0_4 {
	public int solution(int M, int N) {
        int answer = 0;
        							// 이 문제의 규칙을 찾으면 되는데 가로 * 세로 - 1하면 잘라야 하는 횟수가 나옴.
        answer = M * N - 1;			// ex.) M = 2, N = 2 일 때 4 - 1 = 3번만 자르면 됨. 
        							// ex.) M = 3, N = 8 일 때 24 - 1 = 23번만 자르면 됨.
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_4 T = new Num0_4();
//		Scanner sc = new Scanner(System.in);
//		int M = sc.nextInt();
//		int N = sc.nextInt();
//		System.out.println(T.solution(M, N));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_4 T = new Num0_4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M =	Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		System.out.println(T.solution(M, N));
		br.close();
	}
}
