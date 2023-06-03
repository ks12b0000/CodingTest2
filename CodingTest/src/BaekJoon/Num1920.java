package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			int start = 0;
			int end = n - 1;
			int answer = 0;
			int a = sc.nextInt();
			while (start <= end) {
				int mid = (start + end) / 2;
				if (arr[mid] == a) {
					answer = 1;
					break;
				}
				else if (arr[mid] > a) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
			System.out.println(answer);
		}
		
		
		sc.close();
	}
}
