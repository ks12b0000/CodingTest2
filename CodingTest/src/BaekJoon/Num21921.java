package BaekJoon;

import java.util.Scanner;

public class Num21921 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int left = 0;
		int rigth = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int cnt = 1;
		
		while (left <= n - x) {
			int len = Math.abs(rigth - left);
			if (len < x) {
				sum += arr[rigth++];
			}
			else if (len >= x) {
				if (max < sum) {
					cnt = 1;
					max = sum;			
				}
				sum -= arr[left++];
			}
			if (sum == max) cnt++;
		}
		
		if (max == 0) {
			System.out.println("SAD");
		}
		else {
			System.out.println(max);
			System.out.println(cnt);
		}
			
		sc.close();
	}
}
