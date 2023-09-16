package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		Arrays.sort(arr);
		
		int min = 0;
		int max = n - 1;
		
		while (min < max) {
			int sum = arr[min] + arr[max];
			if (sum > x) {
				max--;
			}
			else if (sum < x) {
				min++;
			}
			else {
				answer++;
				max--;
				min++;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
