package Doit알고리즘;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		double sum = 0.0;
		int max = 0;
		for(int i = 0 ; i < A; i++) {
			int B = scan.nextInt();
			if(B > max) {
				max = B;
			}
			sum += B;
		}
		System.out.println(((sum/max)*100) /A);
		
		scan.close();

	}

}
