package BaekJoon;

import java.util.Scanner;

public class Num2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 3;
		int[] arr = new int[16];
		
		for (int i = 1; i < 16; i++) {
			arr[i] = answer * answer;
			answer = answer + (answer - 1);
		}
		
		System.out.println(arr[n]);
		
		sc.close();
	}
}
