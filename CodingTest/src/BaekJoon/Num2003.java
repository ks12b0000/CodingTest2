package BaekJoon;

import java.util.Scanner;

public class Num2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int left = 0;
		int rigth = 0;
		int sum = 0;
		
		while (true) {	
			if (sum >= m) {
				sum -= arr[left++];
			}
			else if (rigth == n) break;
			else if (sum < m) {
				sum += arr[rigth++];
			}
			
			if (sum == m) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
