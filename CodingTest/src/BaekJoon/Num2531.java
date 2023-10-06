package BaekJoon;

import java.util.Scanner;

public class Num2531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] check = new int[d + 1];
		check[c] = 3001;
		int cnt = 1;
		
		for (int i = 0; i < k; i++) {
			if (check[arr[i]] == 0) cnt++;
			check[arr[i]]++;
		}
		
		int max = cnt;
		
		for (int i = 1; i < n; i++) {
			check[arr[i - 1]]--;
			if (check[arr[i - 1]] == 0) {
				cnt--;
			}
			
			check[arr[(i + k - 1) % n]]++;
			if (check[arr[(i + k - 1) % n]] == 1) {
				cnt++;
			}
			
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
