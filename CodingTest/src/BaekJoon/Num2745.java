package BaekJoon;

import java.util.Scanner;

public class Num2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();
		int sum = 0;
		int tmp = 1;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				sum += (c - 'A' + 10) * tmp;
			}
			else {
				sum += (c - '0') * tmp;
			}
			tmp *= n;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
