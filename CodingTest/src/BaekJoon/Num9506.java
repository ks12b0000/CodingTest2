package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			ArrayList<Integer> arr = new ArrayList<>();
			int sum = 0;
			int n = sc.nextInt();
			if (n == -1) {
				break;
			}
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					arr.add(i); 
				}				
			}
			if (sum == n) {
				System.out.print(n + " = ");
				for (int j = 0; j < arr.size(); j++) {	
					if (j == arr.size() - 1) {
						System.out.println(arr.get(j));								
					}
					else {
						System.out.print(arr.get(j) + " + ");
					}							
				}
			}
			else {				
				System.out.println(n + " is NOT perfect.");
			}
		}
		
		sc.close();
	}
}
