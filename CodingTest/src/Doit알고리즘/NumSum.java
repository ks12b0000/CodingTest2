package Doit알고리즘;

import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int sum = 0;
		String B = scan.next();
		for(int i = 0; i < A; i++) {
			
			sum += B.charAt(i) - '0';
		}System.out.println(sum);
		
		
		scan.close();
		

	}

}
