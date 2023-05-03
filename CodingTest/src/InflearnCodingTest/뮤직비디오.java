package InflearnCodingTest;

import java.util.Scanner;

public class 뮤직비디오 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		int rt = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			rt += arr[i];
		}
		
		int lt = arr[arr.length - 1];
		int answer = 0;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			
			if (count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
			else {
				lt = mid + 1;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
	static int count(int[] arr, int mid) {
		int cnt = 1;
		int sum = 0;
		
		for (int x : arr) {
			if (sum + x > mid) {
				cnt++;
				sum = x;
			}
			else {
				sum += x;
			}
		}
		return cnt;
	}
}
