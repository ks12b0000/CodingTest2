package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num4344 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			int student = sc.nextInt();
//			int[] arr = new int[student];
//			int sum = 0;
//			for (int j = 0; j < student; j++) {
//				arr[j] = sc.nextInt();
//				sum += arr[j];
//			}
//			double mean = sum / student;
//			double cnt = 0;
//			
//			for(int j = 0; j < student; j++) {
//				if(arr[j] > mean) {
//					cnt++;
//				}
//			}
//			System.out.printf("%.3f%%\n",(cnt / student) * 100);
//		}		
//		
//		sc.close();
//	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			int[] arr = new int[student];
			int sum = 0;
			for (int j = 0; j < student; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double mean = sum / student;
			double cnt = 0;
			
			for (int j = 0; j < student; j++) {
				if (mean < arr[j]) {
					cnt++;
				}
			}
		
			System.out.printf("%.3f%%\n", (cnt / student) * 100);
		}
		
		br.close();
	}

}