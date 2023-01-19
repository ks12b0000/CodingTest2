package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num10807 {
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int num2 = sc.nextInt();
//		int cnt = 0;
//		
//		for (int i = 0; i < num; i++) {
//			if (arr[i] == num2) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
//		
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int num2 = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			if (arr[i] == num2) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		br.close();
	}

}
