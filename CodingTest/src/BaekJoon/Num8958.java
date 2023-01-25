package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num8958 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			int cnt = 0;
//			int sum = 0;
//			String str = sc.next();
//			for (int j = 0; j < str.length(); j++) {
//				if (str.charAt(j) == 'O') {
//					cnt++;
//				}
//				else {
//					cnt = 0;
//				}
//				sum += cnt;
//			}
//			System.out.println(sum);
//		}
//		
//		sc.close();
//	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			int cnt = 0;
			int sum = 0;
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		
		
		br.close();
	}

}
