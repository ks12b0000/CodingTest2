package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num0_3 {
	public int[] solution(int num, int total) { // ex) num = 3 total = 12, num = 5 total = 15
        int[] answer = new int[num];
        										// (x + 1) (x + 2) (x + 3) = 12, (x + 1) (x + 2) (x + 3) (x + 4) (x + 5) = 15  
        int nsum = num * (1 + num) / 2;     	// x + 6 = 12 , x = 6, x + 15 = 15, x = 0 (x를 구하는 과정)
        int start = (total - nsum) / num;		// (12 - 6) / 3 = 2  (2 + 1) (2 + 2) (2 + 3) = 12,  (15 - 15) / 5 = 0 (x를 구하는 과정)
        
        for (int i = 1; i <= num; i++) {		
        	answer[i - 1] = i + start;			// answer[0] ~ [3] = 1 + 2, 2 + 2, 3 + 2 = 3, 4, 5
        }										// answer[0] ~ [5] = 1 + 0, 2 + 0, 3 + 0, 4 + 0, 5 + 0 = 1, 2, 3, 4, 5
        
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_3 T = new Num0_3();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int total = sc.nextInt();
//		for (int x : T.solution(num, total)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_3 T = new Num0_3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		for (int x : T.solution(num, total)) {
			System.out.print(x + " ");
		}
		
		br.close();
	}
}
