package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num1546 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		double sum = 0;
//		int max = 0;
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//			max = Math.max(arr[i], max);
//			sum += arr[i];
//		}
//
//		System.out.println((sum / max) * 100 / num);
//		
//		sc.close();
//	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = 0;
		double sum = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			sum += arr[i];
		}
		
		System.out.println((sum / max) * 100 / num);
		
		
		br.close();
	}

}
