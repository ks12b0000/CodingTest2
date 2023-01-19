package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num10818 {

	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//	
//		int min = arr[0];
//		int max = min; 
//		
//		for (int i = 0 ; i < num; i++) {
//			max = Math.max(max, arr[i]);
//			min = Math.min(min, arr[i]);
//		}
//		
//		
//		System.out.println(min + " " + max);
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
		
		int min = arr[0];
		int max = min;
		
		for (int i = 0; i < num; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		System.out.printf("%d %d", min, max);
		
		
		br.close();
	}
}
