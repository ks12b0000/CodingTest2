package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1110 {
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int cnt = 0;
//		int A = num;
//		while(true) {
//			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
//			cnt++;
//			
//			if (A == num) break;
//		}
//		
//		System.out.println(cnt);
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		int A = num;
		
		while (true) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;
			
			if (A == num) break;
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}
