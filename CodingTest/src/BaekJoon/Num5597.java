package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num5597 {
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[31];
//		for (int i = 1; i < 29; i++) {
//			arr[sc.nextInt()] = 1;
//		}
//		
//		for (int i = 1; i < 31; i++) {
//			if (arr[i] == 0) {
//				System.out.println(i);
//			}
//		}
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[31];
		
		for (int i = 1; i < 29; i++) {
			arr[Integer.parseInt(br.readLine())] = 1;
		}
		
		for (int i = 1; i < 31; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
		
		br.close();
	}

}
