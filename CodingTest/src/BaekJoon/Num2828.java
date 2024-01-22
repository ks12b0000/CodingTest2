package BaekJoon;

import java.util.Scanner;

public class Num2828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int j = sc.nextInt();
		
		int left = 1;
		int rigth = M;
		int sum = 0;
		
		for (int i = 0; i < j; i++) {
			int where = sc.nextInt();
			
			if (left <= where && rigth >= where) {
				continue;
			}
			if (left > where) {
				sum += left - where;
				rigth -= left - where;	
				left = where;			
			} else {
				sum += where - rigth;
				left += where - rigth;
				rigth = where;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
