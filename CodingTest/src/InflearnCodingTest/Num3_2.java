package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3_2 {
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<Integer> solution(int num, int num2, int[] arr, int[] arr2) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		Arrays.sort(arr);						// arr 값을 오름차순으로 정렬 
//		Arrays.sort(arr2);						// arr 값을 오름차순으로 정렬
//		int p1 = 0;
//		int p2 = 0;
//		while (p1 < num && p2 < num2) {
//			if (arr[p1] == arr2[p2]) {
//				answer.add(arr[p1++]);			// answer.add(arr[p1++]) = answer에 arr[p1]을 집어 넣고 그 후에 p1이 1 증가함.
//				p2++;
//			}
//			else if (arr[p1] < arr2[p2]) {		// arr[p1]이 arr2[p2] 보다 작으면 p1 1증가
//				p1++;
//			}
//			else {
//				p2++;
//			}
//		}
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_2 T = new Num3_2();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int num2 = sc.nextInt();
//		int[] arr2 = new int[num2];
//		for (int i = 0; i < num2; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (int x : T.solution(num, num2, arr, arr2)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	

	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int num2 = sc.nextInt();
//		int[] arr2 = new int[num2];
//		for (int i = 0; i < num2; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		
//		ArrayList<Integer> answer = new ArrayList<>();
//		Arrays.sort(arr);
//		Arrays.sort(arr2);
//		
//		int p1 = 0;
//		int p2 = 0;
//		
//		while (p1 < num && p2 < num2) {
//			if (arr[p1] == arr2[p2]) {
//				answer.add(arr[p1++]);
//				p2++;
//			}
//			else if (arr[p1] < arr2[p2]) {
//				p1++;
//			}
//			else {
//				p2++;
//			}
//		}
//		
//		for (int x : answer) {
//			System.out.print(x + " ");
//		}
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
		int[] arr2 = new int[num2];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int p1 = 0;
		int p2 = 0;
		
		while (p1 < num && p2 < num2) {
			if (arr[p1] == arr2[p2]) {
				answer.add(arr[p1++]);
				p2++;
			}
			else if (arr[p1] < arr2[p2]) {
				p1++;
			}
			else {
				p2++;
			}
		}
		
		for (int x : answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}
}
