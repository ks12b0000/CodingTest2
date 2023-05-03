package InflearnCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 이분검색 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for (int i = 0; i < n; i++) {
//			arr.add(sc.nextInt());
//		}
//		
//		Collections.sort(arr);
//		
//		System.out.println(arr.indexOf(m) + 1);
//		
//		sc.close();
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = n - 1;
		
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == m) {
				System.out.println(mid + 1);
				break;
			}
			if (arr[mid] > m) {
				rt = mid - 1;
			}
			else {
				lt = mid + 1;
			}
		}
		
		sc.close();
	}
}
