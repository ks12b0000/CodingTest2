package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num0_2 {
	public int solution(int[] common) {
        int answer = 0;
        
        if (common[1] - common[0] == common[2] - common[1]) {
        	answer = common[common.length - 1] + (common[1] - common[0]);
        }
        else {
        	answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_2 T = new Num0_2();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] common = new int[num];
//		for (int i = 0; i < num; i++) {
//			common[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(common));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_2 T = new Num0_2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] common = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			common[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(common));
		
		br.close();
	}
}
