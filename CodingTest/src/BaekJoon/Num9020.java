package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int m = 0; m < t; m++) {
			ArrayList<Integer> answer = new ArrayList<>();
			int d = sc.nextInt();
			for (int i = 2; i < d; i++) {
				int cnt = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						cnt++;
					}
				}
				if (cnt == 2) {
					answer.add(i);
				}
			}
			ArrayList<Integer> size = new ArrayList<>();
			for (int i = 0; i < answer.size(); i++) {	
				for (int j = 1; j < answer.size() - 1; j++) {
					if (answer.get(i) + answer.get(j) == d) {
						size.add(answer.get(i) - answer.get(j));				
					}
					if (answer.get(i) + answer.get(j) == d) {
						if (size.get(0) == answer.get(i) - answer.get(j)) {
							System.out.println(answer.get(i) + " " + answer.get(j));
						}
					}
				}
			}
			
			
		}
		
		sc.close();
	}
}
